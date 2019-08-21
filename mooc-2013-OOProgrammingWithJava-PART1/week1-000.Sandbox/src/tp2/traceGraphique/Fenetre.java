/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp2.traceGraphique;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 * Gestion de l'affichage
 * @author JMG
 */
public class Fenetre extends JFrame {
    /**
     * Liste des sommets a tracer
     */
    private double pts[];
    /**
     * Valeurs maximales et minimales des sommets suivant les axes X et Y
     */
    private double ptsMaxX,ptsMaxY,ptsMinX,ptsMinY;

    /**
     * Constructeur unique permettant l'affichage de segment
     * @param contours Liste des segments a tracer
     */
    public Fenetre(Contours contours[]){
        super();
        this.setPreferredSize(new Dimension(400,400));
        recuperationListePoints(contours);
        rechercheMinMax();
        this.setVisible(true);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        pack();
    }

    /**
     * Recherche les coordonnees maximales et minimales des sommets dans la liste des contours
     */
    private void rechercheMinMax(){
        ptsMaxX = pts[0];
        ptsMinX = pts[0];
        ptsMaxY = pts[1];
        ptsMinY = pts[1];
        for(int i=2;i<pts.length;i++){
            if(i%2==0){ // Cas des indices paires (les x)
                if(pts[i] > ptsMaxX) ptsMaxX = pts[i];
                if(pts[i] < ptsMinX) ptsMinX = pts[i];
            }
            else{ // Cas des indices impaires (les y)
                if(pts[i] > ptsMaxY) ptsMaxY = pts[i];
                if(pts[i] < ptsMinY) ptsMinY = pts[i];
            }
        }
    }

    /**
     * Recuperation de la liste des points a partir de la liste des contours
     * @param contours Liste des contours
     */
    private void recuperationListePoints(Contours contours[]){
        // On recherche le nombre de points
        int nbPts = 0;
        for(int i=0;i<contours.length;i++){
            nbPts += contours[i].getAllSommets().length;
        }
        // Construction du tableau de points
        pts = new double[nbPts];
        nbPts = 0;
        // Initialisation des valeurs (methode tres peu efficace)
        for(int i=0;i<contours.length;i++){
            for(int j=0;j<contours[i].getAllSommets().length;j++){
                pts[nbPts] = contours[i].getAllSommets()[j];
                nbPts++;
            }
        }
    }

    /**
     * Permet d'effectuer le trace graphique
     * @param g Contexte graphique
     */
    public void paint(Graphics g){
        double coeff = 0.15;
        // Recuperation de la taile de la JFrame
        double maxGX = g.getClipBounds().getWidth()-20;//-coeff*g.getClipBounds().getWidth();
        double maxGY = g.getClipBounds().getHeight()-50;//-coeff*g.getClipBounds().getHeight();
        // Translation et homotetie des coordonnees des points dans le repere local
        double rX = maxGX/(this.ptsMaxX-this.ptsMinX);
        double rY = maxGY/(this.ptsMaxY-this.ptsMinY);
        double ptsLocal[] = new double[this.pts.length];
        for(int i=0;i<pts.length;i++){
            if(i%2==0) ptsLocal[i] = 10+(-this.ptsMinX+pts[i])*rX;
            else ptsLocal[i] = 40+maxGY - ((-this.ptsMinY+pts[i])*rY);// 30 (taille fenetre) + 10
        }
        // On trace l'ensemble des segments
        for(int i=0;i<pts.length/4;i++){
            g.drawLine((int)ptsLocal[i*4], (int)ptsLocal[i*4+1], (int)ptsLocal[i*4+2], (int)ptsLocal[i*4+3]);
        }
    }
}

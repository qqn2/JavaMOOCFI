/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp2.traceGraphique;

/**
 *
 * @author JMG
 */
public interface Contours {
    /**
     * Permet de récupérer tous les sommets du contour d'une surface. Par exemple
     * pour une triangle ayant 3 sommets il y a aura 12 valeurs :
     * [0] : pt0x (segment 0)
     * [1] : pt0y (segment 0)
     * [2] : pt1x (segment 0)
     * [3] : pt1y (segment 0)
     * [4] : pt0x (segment 1)
     * [5] : pt0y (segment 1)
     * [6] : pt1x (segment 1)
     * [7] : pt1y (segment 1)
     * [8] : pt0x (segment 2)
     * [9] : pt0y (segment 2)
     * [10] : pt1x (segment 2)
     * [11] : pt1y (segment 2)
     * ...
     * @return Vecteur contenant les positions de tous les sommets
     */
    public abstract double[] getAllSommets();
}

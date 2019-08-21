/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package partie2.td1;

/**
 *
 * @author JMG
 */
class Test {
    public static void main(String arg[]){
        Bouteille b1 = new Bouteille(5);
         Bouteille b2 = new Bouteille(5);
        
        b1.ouvrirBouchon();
        b1.remplir(3);
        System.out.println("Affichage de b après rempli 3l :");
        b1.affichage();

        b1.ouvrirBouchon();
        b1.remplir(4);
        
        System.out.println("Affichage de b après rempli 4l :");
        b1.affichage();
        
        b1.vider(4);
        
        System.out.println("Affichage de b après vider 4l :");
        b1.affichage();
        b2.transvaser(b1, 1);
        b1.affichage();
        b2.affichage();
    
    
    
    }
    
    
    
    
}

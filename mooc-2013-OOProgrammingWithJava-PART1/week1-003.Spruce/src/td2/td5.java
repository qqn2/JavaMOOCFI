/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author samy
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td2;

import outils.Clavier;

public class td5 {

    public static int fct() {

        int t1;
        do {
            System.out.print("Taille de tableau: ");
            t1 = Clavier.readInt();
        } while (t1 <= 0);

        return t1;
    }

    public static void affichage(int A, char tableau[]) {
        for (int i = 0; i < A; i++) {
            System.out.println("Valeur saisie pour t[" + i + "] : " + tableau[i]);

        }

    }
    public static void echange(int taille_du_tableau ,char tableau[]) {
        char[] sauvegarde_du_tableau = new char[taille_du_tableau];
        for (int i = 0; i < taille_du_tableau; i++) {
            sauvegarde_du_tableau[i] = tableau[i];
        }
         for (int j = 0; j < taille_du_tableau; j++) {
         //tableau[j]=sauvegarde_du_tableau[taille_du_tableau - 1 - j];
        tableau[j]= Character.toUpperCase(tableau[j]);
         }
   
    
    }

    public static void main(String[] args) {
        int taille = fct();
        char[] t = new char[taille];
        for (int i = 0; i < taille; i++) {
            do {                
                  System.out.print("Valeur pour t[" + i + "] : ");
            t[i] = Clavier.readChar();
            } while (Character.isLowerCase(t[i]) == false && Character.isWhitespace(t[i]) == false);
          
        }

        affichage(taille, t);
        echange(taille, t);
        System.out.println("Nouvelles valeurs apres echange : ");
        affichage(taille, t);
    
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package partie2.td1;

/**
 * @author JMG
 */
class Bouteille {

    // Champs des objets de type Bouteille
    boolean etatBouchon;
    double quantite;
    double volume;

    // Constructeur
    Bouteille(double volume) {
        this.etatBouchon = true;
        this.quantite = 0;
        this.volume = volume;
    }

    // Methodes
    void ouvrirBouchon() {
        etatBouchon = true;
    }

    void fermeBouchon() {
        etatBouchon = false;
    }

    void remplir(double valeur) {
        if (valeur < (this.volume - this.quantite)) {
            if (etatBouchon == true) //ouverte
            {
                quantite += valeur;
            } else {
                System.out.println("Erreur 0 : Bouteille fermée");
            }
        } else {
            System.out.println("Erreur 1: parametre valeur < limite");
        }
    }

    void vider(double valeur) {
        if (this.quantite > valeur) {
            if (etatBouchon == true) //ouverte
            {
                this.quantite -= valeur;
            } else {
               System.out.println("Erreur 2  : Bouteille fermée");
            }
        } else {
            System.out.println("Erreur 3 : parametre valeur < limite");
        }
    }

    void affichage() {
        if (etatBouchon) {
            System.out.print("Bouteille ouverte");
        } else {
            System.out.print("Bouteille fermee");
        }
        System.out.println("  - Quantite de liquide : " + quantite);
    }

    void transvaser(Bouteille b1, double quantite) {
        b1.ouvrirBouchon();
        b1.vider(quantite);
        this.ouvrirBouchon();
        this.remplir(quantite);

    }

}

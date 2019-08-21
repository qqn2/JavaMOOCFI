package td9;

import java.util.ArrayList;

/**
 * Permet de re-organiser un tableau en le classant par ordre croissant
 * @author JMG
 */
public class Trier {
    /**
     * Liste contenant les objets a trier
     */
    private ArrayList <Comparaison> liste;
    /**
     * Constructeur permettant de rendre l'objet de tri utilisable
     */
    public Trier(){
        liste = new ArrayList<Comparaison>();
    }
    /**
     * Ajoute un objet a la liste a trier
     * @param c Valeur 
     */
    public void add(Comparaison c){
        liste.add(c);
    }
    /**
     * Retourne un tableau ordonnance des objets contenus dans la liste
     * ATTENTION : Algorithme de trie simpliste mais inefficace
     * @return Liste d'objet classee par ordre croissant
     */
    public Comparaison[] getCroissant(){
        // Liste contenant les objets ordonnances
        Comparaison ordre[] = new Comparaison[this.liste.size()];
        // On place un permer element dans la liste
        ordre[0] = liste.get(0);
        // On place tous les autres elements dans la liste ordonnancee
        for(int i=1;i<ordre.length;i++){
            // On cherche le lieu ou placer l'objet i
            double val = liste.get(i).compare();
            for(int j=0;j<i;j++){
                if(val < ordre[j].compare()){
                    // Recopie des termes se trouvant au dessus
                    System.arraycopy(ordre, j, ordre, j+1, i-j);
                    // Placement dans le tableau du terme i
                    ordre[j] = liste.get(i);
                    // On poursuit avec l'element suivant puisque l'element i est traite 
                    break;
                }
                // Si a la fin de la recherche l'element i n'a pas ete place (il est donc le plus grand) on le rajoute en fin de liste
                if(j==i-1)
                    ordre[i] = liste.get(i);
            }
        }
        return ordre;
    }
}

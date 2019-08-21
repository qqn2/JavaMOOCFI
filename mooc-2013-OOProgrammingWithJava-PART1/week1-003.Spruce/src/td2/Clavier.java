/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package outils;

import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * Classe permettant de facilité la gestion des entrées clavier
 * L'instanciation est rendu impossible car seul les méthodes statiques sont
 *   nécessaires
 * @author JMG
 */
public class Clavier{
    /**
     * Constructeur privé pour en interdire l'utilisation
     */
    private Clavier(){
    }

    /**
     * Lecture d'un entier à partir de System.in
     * @return Entier lu
     */
    public static int readInt(){
        int val=0;
        try{val = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());}
        catch(Exception exc){exc.printStackTrace();}
        return val;
    }

    /**
     * Lecture d'un double à partir de System.in
     * @return double lu
     */
    public static double readDouble(){
        double val=0;
        try{val = Double.parseDouble((new BufferedReader(new InputStreamReader(System.in))).readLine());}
        catch(Exception exc){exc.printStackTrace();}
        return val;
    }

    /**
     * Lecture d'un char à partir de System.in
     * @return char lu
     */
    public static char readChar(){
        char val[];
        try{
            val =((new BufferedReader(new InputStreamReader(System.in))).readLine()).toCharArray();
            return val[0];
        }
        catch(Exception exc){exc.printStackTrace();}
        return '\u0000';
    }

    /**
     * Lecture d'une chaine de caractère à partir de System.in
     * @return String lu
     */
    public static String readString(){
        String val = "";
        try{
            val =((new BufferedReader(new InputStreamReader(System.in))).readLine());
        }
        catch(Exception exc){exc.printStackTrace();}
        return val;
    }

}

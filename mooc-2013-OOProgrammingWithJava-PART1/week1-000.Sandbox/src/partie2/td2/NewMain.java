/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package partie2.td2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author rekiouas
 */
public class NewMain {

    public static void main(String[] args) {
        /*
        Point point1 =new Point(2.1,3.4);
        point1.affichage();
        Point point2 =new Point(-6.7,0.4);
        System.out.println("La distance : "  +String.format("%.2f", point1.getDistance(point2)));
        Segment s1 = new Segment(point1,point2);
        System.out.println("Longeur : " +s1.getLongeur());
        s1.getMilieu().affichage();
*/      
        Scanner clavier = new Scanner(System.in);
        System.out.println("String 1 : ");
        String s1 = clavier.nextLine();
        System.out.println("String 2 : ");
        String s2 = clavier.nextLine();
        System.out.println("Nombre de carac s1 :" +s1.length());
        System.out.println("Nombre de carac s1 :" +s2.length());
        System.out.println(s1.concat(s2));
        System.out.println(s1.concat(s2).replace('a', 'e'));
        System.out.println(s1.toUpperCase());
        int first = s1.indexOf('A');
        int last=0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == 'A')
                last=i;
                
        }
        System.out.println(s1.substring(first, last+1));
    }
    
    
    
}

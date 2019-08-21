/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td2;

import prepa.Point;
import prepa.Segment;

/**
 *
 * @author rekiouas
 */
public class NewMain {

    public static void main(String[] args) {
        Point point1 = new Point(2.1,3.4);
       Point point2 =new Point(-6.7,0.4);
        point1.affichage();
        System.out.println("La distance :"  +point1.getDistance(point2));
        Segment s1 = new Segment(point1,point2);
        System.out.println("Longeur : " +s1.getLongeur());
        
        
        
        
        
        Segment test = new Segment(point1, point2);
        test.getLongeur();
    }
    
}

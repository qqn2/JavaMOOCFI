/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partie2.td2;

/**
 *
 * @author rekiouas
 */
 class Segment {
     //
     private Point p1;
     private Point p2;
     //Construct
     public Segment(){
     }
     public Segment(Point pt1, Point pt2){
         this.setPoints(pt1, pt2);
     }
     //
     public void affichage(){
      
      this.p1.affichage();
      this.p2.affichage();
     }
     public void setPoints(Point pt1, Point pt2){
         this.p1=pt1;
         this.p2=pt2;
    
    }
     public Point[] getPoints(){
     Point t[]= new Point[2];
     t[0]=this.p1;
     t[1]=this.p2;
     return t;
     }
     public double getLongeur(){
     return this.p1.getDistance(p2);
     }
     
     public Point getMilieu(){
     double coo[]= this.p1.getCoo();
     double coo2[]= this.p2.getCoo();
     double x = (coo[0] + coo2[0])/2;
     double y = (coo[1] + coo2[1])/2;
     
     return new Point(x,y);
        
     
     
     }
     
}

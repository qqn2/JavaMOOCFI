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
 class Point {
     private double x,y; 
    //Constructeur
     Point() {
      this.setCoo(0,0);
     
     }
     Point(double a,double b)
     {
         this.setCoo(a, b);
     }
     //méthodes
     void affichage(){
         System.out.println("x :" +x);
         System.out.println("y : "+y);
     }
     
     void setCoo(double a, double b){
          this.x=a;
          this.y=b;
     }
     
     double[] getCoo(){
     double t[]= new double[2];
     t[0]=this.x;
     t[1]=this.y;
     
     
     return t;
     }
     double getDistance(Point p2){
     return Math.sqrt(Math.pow(this.x-p2.x,2.0)+Math.pow(this.y-p2.y,2.0));
     
     
     }
     
}

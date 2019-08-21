/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partie2.td2;
import java.util.ArrayList;



/**
 *
 * @author samy
 */
public class Polyedre {
    private  ArrayList<Segment> s1 = new ArrayList<Segment>();
    
    public Polyedre(Segment s1) {
        this.addSegment(s1);
    }
    
    public void addSegment(Segment s) {
        s1.add(s);
    }
    
    public void affichage(){
        for (Segment segment : s1) {
           segment.affichage();
            
        }
    }
  public double perimetre(){
       double sum=0.0;
      for (Segment segment : s1) {
           sum+=segment.getLongeur();
            
        }
    return sum;
    }
}

    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;            // imports all tools from java.util, including ArrayList, Scanner ja Random
/**
 *
 * @author samy
 */
public class Changer {
    ArrayList<Change> changes = new ArrayList<Change>();

    public Changer() {
    }
    
    
    
      public void addChange(Change newChange){
        changes.add(newChange);
    }
    
    
    public String change(String str){
        String word = str;
        for (Change st : changes) {
            word = word.replace(st.fromCharacter, st.toCharacter);
        }
        
        return word;
       
    }
    
    
}

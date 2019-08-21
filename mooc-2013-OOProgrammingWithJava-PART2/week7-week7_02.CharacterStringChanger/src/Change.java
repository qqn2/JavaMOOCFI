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
public class Change {
    char fromCharacter;
    char toCharacter;
  

    public Change() {
    }
    
  

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
       
    }
    
    
    
    
    public String change(String str){
       
           return str.replace(this.fromCharacter, this.toCharacter);
       
       
    }
    
    
}

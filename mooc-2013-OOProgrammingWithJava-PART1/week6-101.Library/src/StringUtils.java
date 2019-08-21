/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samy
 */
public class StringUtils {

    public StringUtils() {
    }
    
    
    
     public static boolean included(String word, String searched){
         String searched_maj = searched.toUpperCase().trim();
         String word_maj = word.toUpperCase();
         return word_maj.contains(searched_maj);
        
    }
    
    
}

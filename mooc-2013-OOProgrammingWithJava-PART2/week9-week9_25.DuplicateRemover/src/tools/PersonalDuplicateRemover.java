/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Zenbook
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    private List<String> listOfWords;

    public PersonalDuplicateRemover() {
        this.listOfWords = new ArrayList<String>();
    }

    @Override
    public void add(String characterString) {

      
            listOfWords.add(characterString);
        
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        Set<String> listOfUniqueWords = new HashSet<String>(this.listOfWords);
        return listOfWords.size()-listOfUniqueWords.size();
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return new HashSet<String>(this.listOfWords);
    }

    @Override
    public void empty() {
         this.listOfWords.clear();
         
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Zenbook
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> words;

    public PersonalMultipleEntryDictionary() {
        this.words = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        if (!this.words.containsKey(word)) {
            this.words.put(word, new HashSet<String>());
        }

        this.words.get(word).add(entry);

    }

    @Override
    public Set<String> translate(String word) {
        if (this.words.containsKey(word)) {
            return this.words.get(word);
        } else {
            return null;
        }
    }

    @Override
    public void remove(String word) {

        Set buff = this.translate(word);
        if (buff != null) {
            buff.clear();
            this.words.remove(word);
        }
        
    
    
    
    }

}

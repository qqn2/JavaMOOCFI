
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author samy
 */
public class Dictionary {

    private HashMap<String, String> larousse;

    public Dictionary() {
        this.larousse = new HashMap<String, String>();
    }

    public void add(String word, String translation) {
        this.larousse.put(word, translation);

    }

    public String translate(String word) {
        if (this.larousse.containsKey(word)) {
            return this.larousse.get(word);
        } else {
            return null;
        }

    }

    public int amountOfWords() {

        return this.larousse.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<String>();
        String newString;
        for (String string : this.larousse.keySet()) {
            newString = string + " = " + this.larousse.get(string);
            list.add(newString);

        }
        return list;
    }

}

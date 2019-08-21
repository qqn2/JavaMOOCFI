package wordinspection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Zenbook
 */
public class WordInspection {

    private File file;
    private Scanner reader;

    public WordInspection(File file) {
        this.file = file;
    }

    public int wordCount() throws FileNotFoundException {
        int count = 0;
        String str;
        this.reader = new Scanner(file, "UTF-8");
        while (reader.hasNext()) {
            str = reader.next();
            if (!str.isEmpty()) {
                count++;
            }
        }

        return count;
    }

    public List<String> wordsContainingZ() throws FileNotFoundException {
        List<String> myList = new ArrayList<String>();
        String str;
        this.reader = new Scanner(file, "UTF-8");
        while (reader.hasNext()) {
            str = reader.next();
            if (str.contains("z")) {
                myList.add(str);
            }
        }
        return myList;

    }

    public List<String> wordsEndingInL() throws FileNotFoundException {
        List<String> myList = new ArrayList<String>();
        String str;
        this.reader = new Scanner(file, "UTF-8");
        while (reader.hasNext()) {
            str = reader.next();
            if (str.endsWith("l")) {
                myList.add(str);
            }
        }
        return myList;

    }

    public List<String> palindromes() throws FileNotFoundException {
        List<String> wordList = new ArrayList<String>();
        String word;
        Scanner reader = new Scanner(this.file, "UTF-8");
        while (reader.hasNext()) {
            word = reader.next();
            if (word.equals(reverseWord(word))) {
                wordList.add(word);
            }
        }
        reader.close();
        return wordList;
    }

    public String reverseWord(String word) {
        String reversedWord = "";
        int index = word.length() - 1;
        while (index >= 0) {
            reversedWord += word.charAt(index);
            index--;
        }
        System.out.println(reversedWord);
        return reversedWord;
    }

    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
        List<String> wordList = new ArrayList<String>();
        String word;
        Scanner reader = new Scanner(this.file, "UTF-8");
        while (reader.hasNext()) {
            word = reader.next();
            if (word.contains("a") && word.contains("e") && word.contains("i")
                    && word.contains("o") && word.contains("u") && word.contains("y")
                    && word.contains("ä") && word.contains("ö")) {
                wordList.add(word);
            }
        }
        reader.close();
        return wordList;
    }


}

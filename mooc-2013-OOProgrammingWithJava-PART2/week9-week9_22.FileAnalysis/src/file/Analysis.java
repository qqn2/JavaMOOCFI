/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Zenbook
 */
public class Analysis {

    private File f;
    private Scanner reader;

    public Analysis(File f) {
        this.f = f;
    }

    public int lines() throws FileNotFoundException {
        String duh;
        int count = 0;
        reader = new Scanner(f);
        while (reader.hasNext()) {
            duh = reader.nextLine();
            if (!duh.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    public int characters() throws FileNotFoundException {
        String duh;
        int count = 0;
        reader = new Scanner(f);
        while (reader.hasNext()) {
            duh = reader.nextLine();

                count+=duh.length()+1;
            
        }
        return count;
    }

}


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zenbook
 */
public class Printer {

    private File f;
    private Scanner reader;

    public Printer(String fileName) throws Exception {
        this.f = new File(fileName);

    }

    public void printLinesWhichContain(String word) throws FileNotFoundException {
        this.reader = new Scanner(this.f, "UTF-8");
        while (reader.hasNextLine()) {
            if (reader.nextLine().contains(word)) {
                System.out.println(reader.nextLine());
            }

        }
    }

}

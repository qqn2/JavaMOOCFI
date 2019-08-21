
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author samy
 */
public class TextUserInterface {
    
    private Scanner reader;
    private Dictionary dic;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dic = dictionary;
    }
    
    public void start() {
        System.out.println("Statement:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the text user interface");
        
        while (true) {
            String command = this.reader.nextLine();
            if (command.contains("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (command.contains("add")) {
                System.out.println("In Finnish: ");
                String sr1 = this.reader.nextLine();
                System.out.println("Translation: ");
                String sr2 = this.reader.nextLine();
                this.dic.add(sr1, sr2);
                
            } else if (command.contains("translate")) {
                System.out.println("Give a word: ");
                String sr1 = this.reader.nextLine();
                System.out.print("Translation: ");
                System.out.println(this.dic.translate(sr1));
            } else {
                System.out.println("Unknown statement");
            }
        }
    }
    
}



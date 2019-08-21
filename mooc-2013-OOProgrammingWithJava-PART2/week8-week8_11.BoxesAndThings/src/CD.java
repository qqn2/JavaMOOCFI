/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samy
 */
public class CD implements ToBeStored {
    private String singer;
    private String song;
    private int year;

    public CD(String singer, String song, int year) {
        this.singer = singer;
        this.song = song;
        this.year = year;
    }
    
    

    @Override
    public String toString() {
        return singer + ": " +song + " (" +year + ")"; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    @Override
    public double weight() {
        return 0.1;
    }
    
}


import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samy
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> list = new ArrayList<Card>();
    public void add(Card card) {
        list.add(card);
        
    }
    public void print() {
        for (Card card : list) {
            System.out.println(card);
            
        }
    }
    
    public void sort() {
        Collections.sort(list);
    }

    public ArrayList<Card> getList() {
        return list;
    }
    public void sortAgainstSuit() {
          SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(list,suitSorter);
        
    }
    
    
    @Override
    public int compareTo(Hand o) {
    int sum1=0;
    int sum2=0;
        for (Card card : list) {
            sum1+=card.getValue();
        }
        for (Card card : o.getList()) {
            sum2+=card.getValue();
        }
    return sum1 - sum2;
    
    }
    
    
}

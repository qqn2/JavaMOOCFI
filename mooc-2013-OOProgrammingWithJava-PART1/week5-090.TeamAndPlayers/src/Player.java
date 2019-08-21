/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samy
 */
public class Player  {
    private String nameOfPlayer;
    private int numberOfGoals;

   

    public Player(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
        this.numberOfGoals = 0;
    }

    public Player(String nameOfPlayer, int numberOfGoals) {
        
        this.nameOfPlayer = nameOfPlayer;
        this.numberOfGoals = numberOfGoals;
    }

    public int goals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }
    public String getName (){
        return this.nameOfPlayer;
    }

    @Override
    public String toString() {
        return "Player: " + this.getName() + ", goals" + goals(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

   
   
    
}

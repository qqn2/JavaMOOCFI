/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samy
 */
public class MilitaryService implements NationalService {
    private int days;

    public MilitaryService(int days) {
        this.days = days;
    }

   
    
    
    @Override
    public void work() {
        if (this.days > 0)
        this.days--;
    }

    @Override
    public int getDaysLeft() {
        return this.days;
    }
    
}

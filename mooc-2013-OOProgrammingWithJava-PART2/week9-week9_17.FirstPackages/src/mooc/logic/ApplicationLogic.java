/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mooc.logic;
import mooc.ui.TextUserInterface;
import mooc.ui.UserInterface;
/**
 *
 * @author samy
 */
public class ApplicationLogic {
    private UserInterface test = new TextUserInterface();

   
    public ApplicationLogic(UserInterface test) {
        this.test = test;
    }

   
    public void execute (int howManyTimes){
        for (int i = 0; i < howManyTimes; i++) {
            System.out.println("The application logic works");
            test.update();
        }
        
    }
}

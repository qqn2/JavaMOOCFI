/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samy
 */
public class Calculator {

    private Reader read = new Reader();
    private int stat=0;
    public Calculator() {
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = read.readString();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("sum")) {
                this.sum();
            } else if (command.equals("difference")) {
                this.difference();
            } else if (command.equals("product")) {
                this.product();
            }
        }
        this.statistics();
    }

    private void sum() {
        System.out.print("value1: ");
        int value1 = read.readInteger();
        System.out.print("value2: ");
        int value2 = read.readInteger();
        System.out.print("sum of the values : ");
        System.out.println(value1 + value2);
        stat++;
    }
    
     private void product() {
        System.out.print("value1: ");
        int value1 = read.readInteger();
        System.out.print("value2: ");
        int value2 = read.readInteger();
        System.out.print("product of the values : ");
        System.out.println(value1 * value2);
        stat++;
    }
    private void difference(){
        System.out.print("value1: ");
        int value1 = read.readInteger();
        System.out.print("value2: ");
        int value2 = read.readInteger();
        System.out.print("difference of the values : ");
        System.out.println(value1 - value2);
        stat++;
        
    }
    private void statistics(){
        System.out.print("Calculations done :");
        System.out.println(stat);
    }
    
    

}

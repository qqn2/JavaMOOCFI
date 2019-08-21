/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samy
 */
import java.lang.Math;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint = 0;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void printLine() {

        for (int i = 0; i < this.width; i++) {
            if (Math.random() < this.density) {
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }

    public void print() {
        starsInLastPrint=0;
        for (int i = 0; i < this.height; i++) {
            this.printLine();

        }
    }
    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }
}

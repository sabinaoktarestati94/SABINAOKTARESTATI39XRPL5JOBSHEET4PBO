/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Asus
 */
public class Latihan4A {
    //private member variable
    private String color;
    //constructor
    public Latihan4A (String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "SHape[color=" + color + "]";
    }
    //all shape must have a method called getArea().
    public double getArea(){
        //we need to return some value to compile the program.
        System.err.println("Shape unknwon! Cannot coumpute are!");
        return 0;
    }
}

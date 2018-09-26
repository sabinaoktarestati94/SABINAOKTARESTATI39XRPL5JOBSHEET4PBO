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
public class Latihan4D {
    public static void main (String[] args){
        Latihan4A s1 = new Latihan4B ("red", 4, 5);
        System.out.println(s1);
        System.out.println("Area is " + s1.getArea());
        
        Latihan4A s2 = new Latihan4C ("blue", 4, 5);
        System.out.println(s2);
        System.out.println("Area is " + s2.getArea());
    }
}

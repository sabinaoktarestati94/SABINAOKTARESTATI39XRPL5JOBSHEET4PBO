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
public class Latihan1B extends Latihan1A {
    public void walk(){
        System.out.println("Aeroplan is Flying");
    }
    public static void main (String []args){
    Latihan1B garuda = new Latihan1B ();
    garuda.function();
    garuda.fuel();
    garuda.walk();
    }
}

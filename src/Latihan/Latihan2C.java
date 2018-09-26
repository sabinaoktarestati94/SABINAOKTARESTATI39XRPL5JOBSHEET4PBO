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
public class Latihan2C {
    public static void main(String []args){
        //membuat 2 objek
        Latihan2B line = new Latihan2B (13,37,28,4);
        Latihan2B line2 = new Latihan2B (34,23,16,9);
        //lenght objek 1 dan 2
        System.out.println("Panjang Angka Objek 1 = "+line.getLength());
        System.out.println("Panjang Angka Objek 2 = "+line2.getLength());
        System.out.println("");
        //Perbandingan
        System.out.println("Perbandingan Objek 1 > Objek 2 = "+line.isGreater(line,line2));
        System.out.println("Perbandingan Objek 1 < Objek 2 = "+line.isLess(line,line2));
        System.out.println("Perbandingan Objek 1 = Objek 2 = "+line.isEqual(line,line2));
    }
}


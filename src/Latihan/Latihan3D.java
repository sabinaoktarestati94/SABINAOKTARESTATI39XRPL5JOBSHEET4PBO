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
public class Latihan3D {
    public int hitungGaji(Latihan3A peg){
        int uang = peg.gaji();
        if (peg instanceof Latihan3B)
            uang+=((Latihan3B)peg).tunjangan();
        if(peg instanceof Latihan3C)
        uang +=((Latihan3C)peg).Bonus();
        return uang;
    }
    public static void main (String[] args){
        Latihan3D pg= new Latihan3D();
        Latihan3C ali= new Latihan3C();
        Latihan3B tony = new Latihan3B();
        System.out.println("Gaji yang dibayarkan untuk Staf= " +pg.hitungGaji(ali));
        System.out.println("Gaji yang dibayarkan kepada Direktur=" +pg.hitungGaji(tony));
    }
}

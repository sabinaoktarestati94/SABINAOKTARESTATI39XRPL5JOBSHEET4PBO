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
public class TugasPraktikum1B {
    public static void main(String[]args){
        TugasPraktikum1 r1 = new TugasPraktikum1(1,1,4,4);
        TugasPraktikum1 r2 = new TugasPraktikum1(2,3,5,6);
        TugasPraktikum1 a = r1.union(r2);
        TugasPraktikum1 b = r1.intersection(r2);
        
        if (r2.isInside(r2.x1, r2.y1)==true)
            System.out.println("<"+r2.x1+","+r2.y1+"> is inside the Union");
        System.out.println(r1+" union "+r2+ " = "+a);
        System.out.println(r1+" intersect "+r2+" = "+b);
    }
}


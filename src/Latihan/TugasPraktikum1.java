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
public class TugasPraktikum1 {
//ada 4 variable utama yang menentukan titik sudut persegi panjang
public int x1, y1, x2, y2;

/** Ini adalah constructor utama **/
public TugasPraktikum1 (int x1, int y1, int x2, int y2){
this.x1 = x1;
this.y1 = y1;
this.x2 = x2;
this.y2 = y2;
}
/** constructor dengan panjang dan lebar dimulai dari koordinat 0,0 **/
public TugasPraktikum1 (int width, int height){
this(0, 0, width, height);
}

/** method untuk menggeser persegipanjang **/
public void move (int deltax, int deltay)
{
    x1 += deltay; x2 += deltax;
    y1 += deltay; y2 += deltay;
}
    /** method untuk memeriksa apa satutitik didalam persegi panjang*/
     public boolean isInside(int x, int y){
         return ((x >= x1)&&(x <= x2)&&(y >= y1)&&(y <=y2));}
     
         /** method untuk menggabung (union) persegi panjang */
         public TugasPraktikum1 union(TugasPraktikum1 r){
             return new TugasPraktikum1
                   ( (this.x1 < r.x1) ? this.x1 : r.x1,
                     (this.y1 < r.y1) ? this.y1 : r.y1,
                     (this.x2 > r.x2) ? this.x2 : r.x2,
                     (this.y2 > r.y2) ? this.y2 : r.y2);
}
         /** method untuk mengetahui perpotongan dua persegi panjang*/
         public TugasPraktikum1 intersection(TugasPraktikum1 r){
             TugasPraktikum1 result = new TugasPraktikum1(
                     (this.x1 > r.x1) ? this.x1 : r.x1,
                     (this.y1 > r.y1) ? this.y1 : r.y1,
                     (this.x2 < r.x2) ? this.x2 : r.x2,
                     (this.y2 < r.y2) ? this.y2 : r.y2);
                     if (result.x1 > result.x2) {
                         result.x1 = result.x2 = 0;
}
                     if (result.y1 > result.y2){
                         result.y1 = result.y2 = 0;
         }
         return result;
         }
}


                     
     
     



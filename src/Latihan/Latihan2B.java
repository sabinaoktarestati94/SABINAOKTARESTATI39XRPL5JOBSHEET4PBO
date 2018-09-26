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
class Latihan2B implements Latihan2A {
private double x1;
private double x2;
private double y1;
private double y2;

public Latihan2B (double x1, double x2, double y1, double y2){
this.x1=x1;
this.x2=x2;
this.y1=y1;
this.y2=y2;
}
public double getLength(){
double length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
return length;
}
public boolean isGreater (Object a, Object b){
double aLen=((Latihan2B)a).getLength();
double bLen=((Latihan2B)b).getLength();
return (aLen>bLen);
}
public boolean isLess(Object a, Object b){
    double aLen=((Latihan2B)a).getLength();
    double bLen=((Latihan2B)b).getLength();
    return(aLen<bLen);
}
public boolean isEqual(Object a, Object b){
    double aLen=((Latihan2B)a).getLength();
    double bLen=((Latihan2B)b).getLength();
    return(aLen==bLen);
}
}

package com.company;

public class Pro_6_205 {
    public static double   Quadratic(double x){
        double res=3*Math.pow(x,2)-8*x+4;
        return res;
    }
    public static void main(String[] args) {
        double  a=Pro_6_205.Quadratic(4);
        System.out.println(a);

    }
}

package com.company;

public class Programm_3 {
    void num_calc(int num,char ch){
        System.out.println("This The Overloaded Function1");
        if(ch=='s')
            System.out.println("Square Of the Number Is"+Math.pow(num,2));
        else
            System.out.println("Cube Of The NUmber Is"+Math.pow(num,3));
    }
    void num_calc(int a,int b,char ch){
        System.out.println("This The Overloaded Function2");

        if(ch=='p')
            System.out.println("Product Of Integers Is"+(a*b));
        else
            System.out.println("Sum Of The Integers Is"+(a+b));
    }
    void num_calc(String s1,String s2){
        System.out.println("This The Overloaded Function3");

        if(s1.length()==s2.length())
            System.out.println("Both Strings Are equal");
        else
            System.out.println("Strings Are Not Equal");
    }
    public static void main(String[] args) {
        Programm_3 obj=new Programm_3();
        obj.num_calc("Pawan","pa");

    }
}

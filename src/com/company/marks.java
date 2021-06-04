package com.company;

import java.util.Scanner;

class exam{
    public int qmarks;public int hmarks;public int finalmarks;public double weightedmarks;
    public void TakeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks taken in Quarterly");
        qmarks=sc.nextInt();
        System.out.println("Enter the marks in half yearly");
        hmarks=sc.nextInt();
        System.out.println("Enter the final marks");
        finalmarks=sc.nextInt();

    }
    public void Calculate(){
        weightedmarks=(0.30*(qmarks+hmarks)) +(0.40*finalmarks);
        System.out.println(weightedmarks);
    }
}
public class marks {
    public static void main(String[] args) {
        exam e=new exam();
        e.TakeInput();
        e.Calculate();

    }
}

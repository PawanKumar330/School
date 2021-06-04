package com.company;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();
        System.out.println("The Reversed Number Is");
        while(n>0){
            int r=n%10;
            System.out.print(r);
            n=n/10;
        }
    }
}

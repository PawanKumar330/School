package com.company;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        System.out.println("Enter The Number");
        for(int i=1;i<=10;i++){
            System.out.println("Enter The Number");
            int n=sc.nextInt();
            if(n%2==0)
                c++;
            if(c==4)
                break;
        }
        System.out.println("You Have Entered Four Even Number");



    }
}

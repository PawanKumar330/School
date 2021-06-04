package com.company;

import java.util.Scanner;

public class while2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=1;int sum=0;
        for(int i=1;i<=5;i++){
            System.out.println("Enter The Number");
             n=sc.nextInt();
             if(n==0)
                 break;
             else
                 sum++;
       }
        System.out.println(sum);
    }
}

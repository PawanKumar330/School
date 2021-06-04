package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter The Number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();int sum=0;int product=1;
        int c=0;int m=n;int k=n;
        while(m>0){
            m=m/10;
            c++;
        }
        int d=c;
        for(int i=1;i<=c;i++){
            int r=k%10;
            d=d-1;
            sum=sum+(r* (int) Math.pow(10,d));
            k=k/10;
        }
        if(sum==n)
            System.out.println("It Is Palindrome number");
        else
            System.out.println("It Is Not Palindrome Number");
    }
}

package com.company;

import java.util.Scanner;

public class while1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;int UserInput=1;
        while(UserInput!=0){
            System.out.println("Enter The Number");
             UserInput=sc.nextInt();
            sum=sum+UserInput;

        }
        System.out.println(sum);



    }
}

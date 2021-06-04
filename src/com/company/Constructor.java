package com.company;
import java.util.Scanner;
class Date{
    public int RunsScored;public int BallFaced;public double StrikeRate;

   public void TakeInput(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter The RunsScored");
       RunsScored=sc.nextInt();
       System.out.println("Enter The Balls Faced");
       BallFaced=sc.nextInt();
   }
   public void Calculate(){
        StrikeRate=(RunsScored*100)/BallFaced;
        System.out.println("The Strike Rate Of Batsman is"+StrikeRate);

   }
}
public class Constructor {
    public static void main(String[] args) {
        Date d=new Date();
        d.TakeInput();
        d.Calculate();

    }
}

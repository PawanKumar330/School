package com.company;

import java.util.Scanner;

class CountAmount {
    public int amount;public int TwoThousand,thousand,FiveHundred,TwoHundred,OneHundred,Fifty,Twenty,Ten,Five,Two,one;
    int [] notes=new int[1000];

    public void takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Amount");
        amount=sc.nextInt();
    }
    public void Calculate(){
        if(amount>=2000){
            TwoThousand=amount/2000;
            amount=amount-(TwoThousand*2000);
            System.out.println("You Have" +TwoThousand+"Notes Of Two Thousand");
                }

            if((amount<2000) &&(amount>=1000)){
                thousand=amount/1000;
                amount=amount-(thousand*1000);


                System.out.println("You Have "+thousand +"Notes Of Thousand") ;
                }
            if((amount<1000) &&(amount>=500)) {
                FiveHundred=amount/500;
                amount=amount-(FiveHundred*500);
                System.out.println("You Have"+FiveHundred +"Notes Of Five Hundred");
                      }
            if((amount<500) &&(amount>=200)){
                TwoHundred=amount/200;
                amount=amount-(TwoHundred*200);
                System.out.println("You Have"+TwoHundred +"Notes Of Two Hundred");

            }

            if((amount<200) &&(amount>=100)){
                OneHundred=amount/100;
                if(OneHundred!=0)
                    amount=amount-(OneHundred*100);
                System.out.println("You Have"+OneHundred +"Notes Of One Hundred");

            }


            if((amount<100) &&(amount>=50)){
                Fifty=amount/50;
                amount=amount-(Fifty*50);
                System.out.println("You Have"+Fifty +"Notes Of Fifty");


            }
            if((amount<50) &&(amount>=20)){
                Twenty=amount/20;
                if(Twenty!=0)
                    amount=amount-(Twenty*20);
                System.out.println("You Have"+Twenty +"Notes Of  Twenty");
                  }
            if((amount<20) &&(amount>=10)){
                Ten=amount/10;
                amount=amount-(Ten*10);
                System.out.println("You Have"+Ten +"Notes Of Ten");

            }
            if((amount<10) &&(amount>=5)){
                Five=amount/5;
                amount=amount-(Five*5);
                System.out.println("You Have"+Five +"Notes Of Five Rupees");

            }
        if((amount<5) &&(amount>=2)){
            Two=amount/2;
            amount=amount-(Two*2);
            System.out.println("You Have"+Two +"Notes Of Two Rupees");

        }
        if(amount == 1){
            one=amount/1;
            System.out.println("You Have"+one +"Notes Of One Rupees");


        }
 }
    }

public class Notes {
    public static void main(String[] args) {
         CountAmount c=new CountAmount();
         c.takeInput();
         c.Calculate();
    }
}

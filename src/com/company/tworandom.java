

import java.util.Random;
import java.util.Scanner;

public class tworandom {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int randnumber=rand.nextInt(100);
        int UserInput=0;
        int UserGuesses=0;
        while(randnumber!=UserInput){
            UserGuesses++;
            System.out.println("Enter The Number");
             UserInput=sc.nextInt();
             if(UserInput==randnumber)
                 System.out.println("You Have Guessed The Number Correctly"+"in "+UserGuesses+"Guesses");
             else if(UserInput>randnumber)
                 System.out.println("Enter A Smalller Number");
             else
                 System.out.println("Enter A larger Number");
        }


    }
}

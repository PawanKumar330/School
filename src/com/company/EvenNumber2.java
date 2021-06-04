

import java.util.Scanner;

public class EvenNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number");
        long n = sc.nextLong();
        long a = CheckLength(n);

        if (a != 10)
            System.out.println("You have Entered The Digit which does Not Have length Of 10");
        if (a == 10) {
            while (n > 0) {
                long r = n % 10;
                if (r % 2 == 0)
                    System.out.println(r);
                n = n / 10;
            }

        }
    }
   static long CheckLength(long n){
        long c=0;
        while(n>0){
            n=n/10;
            c++;
        }
        return c;
   }
}

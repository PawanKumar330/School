import java.util.Scanner;

public class select {
    public void test(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();
        if(n>0 && n<10)
        System.out.println("You Enterd A Single Digit Number");
        else
        System.out.println("You Entered A double Digit Number ");
    }
   
    
}

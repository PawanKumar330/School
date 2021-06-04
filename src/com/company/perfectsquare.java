import java.util.Scanner;
public class perfectsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++){
            if(i*i==n){
            
             c++;
            }
            
        }
        if(c!=1)
        System.out.println("Not Perfect Square");

    }
}

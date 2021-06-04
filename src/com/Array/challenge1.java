import java.util.Scanner;

public class challenge1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);int max=0;
        System.out.println("Enter the length of array");
        int length=sc.nextInt();
        int a[]=new int[length];
        for(int i=0;i<=a.length-1;i++){
            System.out.println("Enter the number at index 0");
            int b=sc.nextInt();
            a[i]=b;
        }
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
            System.out.println(max);
        }
       
    }
}

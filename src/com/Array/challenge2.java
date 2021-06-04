import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,2};
        int sum2=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
         for(int j=i;j<a.length;j++){
           sum=sum+a[j];
           sum2=sum2+sum;
         }
         
        }
        System.out.println(sum2);
        
    }
}

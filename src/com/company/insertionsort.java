import java.util.Scanner;
public class insertionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);int temp;
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
         System.out.println("Enter the number at index "+i);
         int m=sc.nextInt();
         a[i]=m;
        }
        for(int i=0;i<a.length-1;i++){
         for(int j=0;j<=i;j++){
             if(a[j]>a[i+1]){
            temp=a[i+1];
            a[i+1]=a[j];
            a[j]=temp;
             }
         }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        

    }
}

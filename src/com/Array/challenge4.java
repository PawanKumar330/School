import java.util.Scanner;

public class challenge4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        System.out.println("Enter the sum of the subarray");
        int s=sc.nextInt();int a[]=new int[n];
        int k=a.length;
        for(int i=0;i<a.length;i++){
          System.out.println("Enter the elements at index"+i);
          int m=sc.nextInt();
          a[i]=m;
        }
        
        for(int i=0;i<a.length;i++){
            k--;int c=0;
            int sum=0;
            for(int j=i;j<=k;j++){
            sum=sum+a[j];
            if(s==sum){
                System.out.print(i +" to ");
                System.out.print(j);
                c++;
                break;

            }
            }
            if(c==1)
            System.out.println();
            

        }
        
    }
}

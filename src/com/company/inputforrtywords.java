import java.util.Scanner;

public class inputforrtywords {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       char a[]=new char[41];char temp;
       for(int i=0;i<2;i++){
           System.out.println("Enter the element at index"+i);
           char n=sc.next().charAt(0);
           a[i]=n;
    
       }
       for(int i=0;i<a.length;i++){
        int max=0;
        for(int k=i;k<a.length;k++){
            if(max<(int)a[k]){
                max=a[k];
            }
            for(int j=0;j<a.length;j++){
                if(max==(int)a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                }
            }
         }
       }
       for(int i=0;i<a.length;i++){
           System.out.println(a[i]+" ");
       }
    
      
    }
}

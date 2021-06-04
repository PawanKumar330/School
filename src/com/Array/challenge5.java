import java.util.Scanner;

public class challenge5{
    public static void main(String args[]){
        int a[]={5,10,12,14};int e=0;
        for(int i=0;i<a.length;i++){
            int c=0;int d=0;
            if(a[i]>0)
            c++;
            if(c==1){
                for(int j=i;j<a.length;j++){
                    if(a[i]+1==a[j]){
                        d++;
                        break;
                    }
                    
                }
                
                if(d==0){
                   System.out.println(a[i]+1);
                    break;
                }
                

                
            }
        }
     }
}
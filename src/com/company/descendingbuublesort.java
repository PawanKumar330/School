import java.util.Scanner;
public class descendingbuublesort {
    public static void main(String[] args) {
        int array[]=new int[11];int temp;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=10;i++){
         System.out.print("Enter The Number");
         int n=sc.nextInt();
         array[i]=n;
        }
        for(int i=0;i<=array.length-1;i++){
            for(int j=0;j<=array.length-2-i;j++){
              if(array[j]<array[j+1]){
                  temp=array[j];
                  array[j]=array[j+1];
                array[j+1]=temp;
              }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}

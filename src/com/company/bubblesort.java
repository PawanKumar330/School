public class bubblesort{
    public static void main(String[] args) {
        int k[]={36,19,12,5,17};
        int temp;
        for(int i=0;i<=k.length-1;i++){
            int flag=0;
            for(int j=0;j<=k.length-1-1-i;j++){
               if(k[j]>k[j+1]){
                 temp=k[j];
                 k[j]=k[j+1];
                 k[j+1]=temp;
                 flag=1;
               }
            }
            if(flag==0)
            break;
        }
        for(int i=0;i<k.length;i++){
            System.out.print(k[i]+" ");
        }
    }
}
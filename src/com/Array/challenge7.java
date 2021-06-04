public class challenge7 {
    public static void main(String[] args) {
        int a[]={1,2,0,7,2,0,2,2};
        for(int i=0;i<a.length-1;i++){
            int c=0;
        for(int j=i;j>0;){
            --j;
            if((a[i]<a[j]) &&(a[i]<a[i+1]))
            c++;
 }
 if(c==0)
        System.out.println(a[i]);
        }
        
    }
}

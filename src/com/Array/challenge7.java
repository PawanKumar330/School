public class challenge7 {
    
    public static void main(String[] args) {
        int a[]={1,-1,0,7,2,8,2,9};int d=0;
        int b[]=new int[a.length];
       for(int i=a.length-1;i>=0;i--){
           int c=0;
           for(int j=i-1;j>=0;j--){
               if((a[i]>a[j]) &&(i==a.length-1))
               c++;
               else if((a[i]>a[j]) && (a[i]>a[i+1]))
               c++;
           }
           if((c==i) &&(i!=0))
           d++;
           if(i==0)
           if(a[i]>a[i+1])
           d++;
           

       }
       System.out.println(d);
      
       
        
    }
}

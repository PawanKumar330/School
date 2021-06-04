public class diagonal {
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int column=3;int sum=0;int rows=3;
        for(int i=0;i<=rows;i++){
            for(int j=column;j>=column;j--){
               sum=sum+a[i][j];
            }
            column--;
        }
        int c1=3;int r1=3;
        for(int i=0;i<=r1;i++){
            for(int j=0;j<=i;j++){
             if(i==j)
             sum=sum+a[i][j];
            }
        }
        System.out.println(sum);
    }
}

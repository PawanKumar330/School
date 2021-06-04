/*
Progranm: 1.12
Page No:24
*/

public class nested{
    public static void PreIncrement(){
        for(int i=1;i<=4;++i){
            for(int j=1;j<=i;++j){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    public static void PostIncrement(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       PreIncrement();
       PostIncrement();
    }
}
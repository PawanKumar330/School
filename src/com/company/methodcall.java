package com.company;

public class methodcall {
    public static int x=10;
    public static int y=20;
    public static void swapCallByValue(int a,int b){
        System.out.println("Before  Reversing By Method SwapCallByValue");
        System.out.println("Value Of A Is:"+a);
        System.out.println("Value Of B Is:"+b);
        int tmp;
        tmp=b;
        b=a;
        System.out.println("After Reversing By Method SwapCallByValue");
        System.out.println("Value Of A Is:"+tmp);
        System.out.println("Value Of B Is:"+b);
    }
    public static void callByRef(methodcall obj){
        System.out.println("Before  Reversing By Method SwapCallByReference");
        System.out.println("Value Of A Is:"+obj.x);
        System.out.println("Value Of B Is:"+obj.y);
        int temp;
        temp=obj.y;
        obj.y=obj.x;
        System.out.println("During  Reversing By Method SwapCallByReference");
        System.out.println("Value Of A Is:"+temp);
        System.out.println("Value Of B Is:"+obj.y);
        System.out.println("After   Reversing By Method SwapCallByReference");
        System.out.println("Value Of A Is:"+temp);
        System.out.println("Value Of B Is:"+obj.y);

    }
    public static void main(String[] args) {
        methodcall obj1=new methodcall();
        methodcall.callByRef(obj1);
        methodcall.swapCallByValue(15,20);
 }
}

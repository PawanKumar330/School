class array3 extends Array2{
    public int min=99999;public int c=0;public int a;
    public void SelectionSort(){
        for(int i=0;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
            System.out.println("Min Value"+min);
        for(a=0;a<array.length;a++){
            if(min==array[a]){
                c++;
                break;
            }
            if(c==1){
                System.out.println(min +"Present At Index No"+a);
                break;
            }
     
        }
        
            
            
       
    
    }
}
public class insertion2sort {
    public static void main(String[] args) {
        array3 obj=new array3();
        obj.Insert();
        obj.SelectionSort();
        
    }
}

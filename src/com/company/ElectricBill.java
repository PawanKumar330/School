
class MyElectricBill{
    public String n;public int units;public double  Bill;
    public double  getBill(){
        return Bill;
    }

    public void Accept(String n,int units){
        this.n=n;
        this.units=units;
    }
    public void Calculate(){
        if((units>=1) &&( units<=100))
            Bill=units*2.00;
        else if((units>100) &&(units<=200))
            Bill=units*3.00;
        else if(units>300)
            Bill=(units*5.00) +(0.025*(units*5.00));
        else
            System.out.println("Invalid Value");
    }
    public void Print(){
        System.out.println("Name Of The Customer Is"+n);
        System.out.println("Number Of Units Consumed"+units);
        System.out.println("Your Total Bill Is"+Bill);
    }
}
public class ElectricBill {
    public static void main(String[] args) {
        MyElectricBill obj=new MyElectricBill();
        obj.Accept("Upendra Yadav",310);
        obj.Calculate();
        obj.Print();
    }
}

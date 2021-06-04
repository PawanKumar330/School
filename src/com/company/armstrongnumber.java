import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        int temp;
        temp = n;
        int digit = 0;
        while (temp > 0) {
            digit++;
            temp = temp / 10;
        }
        temp = n;
        int sum = 0;
        for (int i = 1; i <= digit; i++) {
            int remainder = temp % 10;
            sum = sum + (int) Math.pow(remainder, digit);
            temp = temp / 10;
        }
        if (sum == n)
            System.out.println(+n + "is an Armstrong number");
        else
            System.out.println(+n + "Is Not An Armstrong number");
    }
}

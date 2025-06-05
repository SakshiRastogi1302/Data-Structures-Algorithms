
import java.util.Scanner;

public class BinaryToDecimalCode {
    public static int convertBinaryNoToDecimalNo(int n) {
        int pow = 1;
        int decimalNo = 0;

        while (n > 0) {
            int rem = n % 10;
            decimalNo = decimalNo + rem * pow ;
            n = n / 10;
            pow = pow * 2;
        }

        return decimalNo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        System.out.println(convertBinaryNoToDecimalNo(n));
        sc.close();
    }    
}

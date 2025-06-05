
import java.util.Scanner;

public class DecimalToBinaryCode {
    public static int convertDecimalNoToBinaryNo(int n) {
        int binaryNo = 0;
        int pow = 1;
        while (n > 0) {
            int rem = n % 2;
            binaryNo = binaryNo + rem * pow;
            n = n / 2;
            pow=pow*10;

        }

        return binaryNo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        System.out.println(convertDecimalNoToBinaryNo(n));
        sc.close();
    }
}

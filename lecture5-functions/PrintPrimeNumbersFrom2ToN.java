
import java.util.Scanner;

public class PrintPrimeNumbersFrom2ToN {
    public static void printPrimeNumbersFrom2ToN(int n){
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i+" ") ;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        printPrimeNumbersFrom2ToN(n);
        sc.close();
    }
}

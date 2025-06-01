
import java.util.Scanner;

public class BinomialCoefficient {

    public static int findFactorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
    public static int findBinomialCofficient(int n, int r) {
        int nFactorial = findFactorial(n);
        int rFactorial = findFactorial(r);
        int nMinusRFactorial = findFactorial(n - r);

        int binomailCoefficient = nFactorial / (rFactorial * nMinusRFactorial);
        return binomailCoefficient;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of objects :- ");
        int n = sc.nextInt();
        System.out.print("Enter the number of ways of choosing r objects from n :- ");
        int r = sc.nextInt();
        System.out.println(findBinomialCofficient(n, r));
        
        sc.close();
    }
}

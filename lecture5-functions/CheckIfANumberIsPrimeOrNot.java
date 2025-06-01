
import java.util.Scanner;

public class CheckIfANumberIsPrimeOrNot {
    public static String findIfNIsPrimeOrNot(int n) {
        if (n == 0 || n == 1) {
            return "not prime";
        }
        boolean isPrime = true;

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            return "prime";
        }

        return "not prime";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        System.out.println("Number "+n+" is "+findIfNIsPrimeOrNot(n));
        sc.close();
    }
}

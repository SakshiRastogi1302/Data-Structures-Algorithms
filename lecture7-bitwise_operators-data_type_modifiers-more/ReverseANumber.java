import java.util.Scanner;

public class ReverseANumber {

    public static int reverseANumber(int n) {
        int reversedNumber = 0;
        int pow = 10;

        while (n > 0) {
            int rem = n % 10;
            reversedNumber = reversedNumber * pow + rem;
            n = n / 10;
        }

        return reversedNumber;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        int reversedNumber = reverseANumber(n);
        System.out.println(reversedNumber);
        sc.close();
    }
}

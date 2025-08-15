import java.util.Scanner;

public class NthFibonacci {
    public static void printNthFibonacci(int n) {
        if (n == 0 || n == 1) {
            System.out.println(n);
            return;
        }

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;

        }

        System.out.println(c);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        printNthFibonacci(n);
        sc.close();
    }
}

import java.util.Scanner;


public class MinOfTwoNumbers {
    static int min(int a, int b) {
        if (a < b) {
            return a;
        }

        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :- ");
        int a = sc.nextInt();
        System.out.print("Enter the second number :- ");
        int b = sc.nextInt();

        System.out.println("Min of 2 numbers "+a+" & "+b+" is :- "+min(a,b));

        sc.close();
    }
}

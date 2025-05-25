import java.util.Scanner;

public class Operators {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integer number :- ");
        int a = sc.nextInt();
        System.out.print("Enter the second integer number :- ");
        int b = sc.nextInt();
        System.out.print("Enter the third integer number :- ");
        int c = sc.nextInt();
        System.out.print("Enter the fourth double number :- ");
        double d = sc.nextDouble();
                
        int sum = a+b;
        int difference = a-b;
        int product = a*b;
        int quotient = a/b;
        int remainder = a%b;
        double doubleQuotientResult = c/d;
        int intQuotientResult = (int)(c/d); // If you don't type cast the expression it will throw an error (Lossy conversion from double to int)

        System.out.println("Sum of " + a + " and " + b + " is " + sum);
        System.out.println("Difference of " + a + " and " + b + " is " + difference);
        System.out.println("Product of " + a + " and " + b + " is " + product);
        System.out.println("Quotient of " + a + " and " + b + " is " + quotient);
        System.out.println("Remainder of " + a + " and " + b + " is " + remainder);
        System.out.println("Quotient of " + c + " and " + d + " is " + doubleQuotientResult);
        System.out.println("Quotient of " + c + " and " + d + " is " + intQuotientResult);
        System.out.println(3 < 5);
        System.out.println(3 > 5);
        System.out.println(3 <= 5);
        System.out.println(3 == 3);

        System.out.println(!(3 < 5));
        System.out.println((3 < 5) || (4 > 5));
        System.out.println((3 < 5) && (4 > 3));
        

        sc.close();
    }
}

import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :- ");
        int a = sc.nextInt();
        System.out.print("Enter the second number :- ");
        int b = sc.nextInt();

        int bitwiseAnd = a & b;
        System.out.println(bitwiseAnd);

        int bitwiseOr = a | b;
        System.out.println(bitwiseOr);

        int bitwiseXor = a ^ b;
        System.out.println(bitwiseXor);

        int bitwiseLeftShift = a << b;
        System.out.println(bitwiseLeftShift);

        int bitwiseRightShift = a >> b;
        System.out.println(bitwiseRightShift);
    }
}

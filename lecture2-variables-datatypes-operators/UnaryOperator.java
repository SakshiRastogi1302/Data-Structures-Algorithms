import java.util.Scanner;

public class UnaryOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int a = sc.nextInt();
        int b = a++;
        System.out.println("a = " + a + " b = " + b);
        b = ++a;
        System.out.println("a = " + a + " b = " + b);
        b = a--;
        System.out.println("a = " + a + " b = " + b);
        b = --a;
        System.out.println("a = " + a + " b = " + b);
        sc.close();
    }
}

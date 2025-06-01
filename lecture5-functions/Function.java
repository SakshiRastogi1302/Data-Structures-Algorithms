
import java.util.Scanner;


public class Function {

    // Non-Returning printHello Function
    // static void printHello() {
    //     System.out.println("Hello");
    // }

    //Returning printHello Function
    static int printHello() {
        System.out.println("Hello");
        return 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printHello();
        int a = 10;
        int b = 20;
        System.out.println(a + " " + b);
        printHello();
        System.out.println(printHello());

        sc.close();

    }
}

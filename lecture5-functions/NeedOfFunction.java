import java.util.Scanner;
public class NeedOfFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Hello print statement is written multiple times. Avoid this using a function
        System.out.println("Hello");
        int a = 10;
        int b = 20;
        System.out.println(a + " " + b);
        System.out.println("Hello");
        sc.close();

    }    
}

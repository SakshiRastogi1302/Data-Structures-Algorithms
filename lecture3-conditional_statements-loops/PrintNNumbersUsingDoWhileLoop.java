import java.util.Scanner;

public class PrintNNumbersUsingDoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();

        int i = 1;
        do{
            System.out.print(i+" ");
            i=i+1;
        } while (i <= n);

        sc.close();
    }
}

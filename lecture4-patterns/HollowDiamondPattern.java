import java.util.Scanner;

public class HollowDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            if (i != 0) {
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();

        }
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            
            if (i != n - 2) {
                for (int k = 0; k < ((2 * (n - 2 - i)) - 1); k++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();
           
        }
    }
}

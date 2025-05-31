import java.util.Scanner;

public class SquarePattern3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char c = 'A';
            for (int j = 0; j < n; j++) {
                System.out.print(c + " ");
                c = (char) (c + 1);
            }
            System.out.println();
        }

        sc.close();
    }
}

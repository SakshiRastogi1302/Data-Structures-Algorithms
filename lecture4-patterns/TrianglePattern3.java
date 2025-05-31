import java.util.Scanner;

public class TrianglePattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();

        char c = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            c = (char) (c + 1);
            System.out.println();
        
        }
        sc.close();
    }
}

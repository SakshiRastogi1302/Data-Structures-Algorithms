import java.util.Scanner;

public class FloydsTrianglePattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();

        int num =  1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            
            System.out.println();
        }
        sc.close();
    }
}

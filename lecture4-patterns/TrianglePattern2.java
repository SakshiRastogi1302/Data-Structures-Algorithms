
import java.util.Scanner;

public class TrianglePattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();

        // Approach 1
        // int num = 1;

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(num + " ");
        //     }
        //     num++;
        //     System.out.println();
        // }

        //Approach 2 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
        
        sc.close();
    
    
    }
}

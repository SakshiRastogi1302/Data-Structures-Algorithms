import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= i + 1; k++) {
                System.out.print(k);
            }
            
            for (int l = i; l > 0; l--) {
                System.out.print(l);
            }
            
            System.out.println();


        }

        sc.close();
        
    }
}

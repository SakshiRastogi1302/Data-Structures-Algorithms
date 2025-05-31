
import java.util.Scanner;

public class ReverseTrianglePattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}

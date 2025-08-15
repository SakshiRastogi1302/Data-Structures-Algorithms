import java.util.Scanner;

public class PassByReference {
    public static void changeArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * arr[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array :- ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        changeArray(arr);

         
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

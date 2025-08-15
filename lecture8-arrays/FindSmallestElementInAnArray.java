import java.util.Arrays;
import java.util.Scanner;

public class FindSmallestElementInAnArray {

    public static int findSmallestElementInAnArray(int arr[]) {
        int smallestElement = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // if (arr[i] < smallestElement) {
            //     smallestElement = arr[i];
            // }

            smallestElement = Math.min(smallestElement, arr[i]);
        }

        return smallestElement;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array :- ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Smallest Number in the array " + Arrays.toString(arr) + " is :- " + findSmallestElementInAnArray(arr));
        sc.close();
    }
    
}

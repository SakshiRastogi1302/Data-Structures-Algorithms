import java.util.Arrays;
import java.util.Scanner;

public class FindLargestElementInAnArray {
    public static int findLargestElementInAnArray(int arr[]) {
        int largestElement = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // if (arr[i] > largestElement) {
            //     largestElement = arr[i];
            // }

            largestElement = Math.max(largestElement, arr[i]);
        }

        return largestElement;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array :- ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Largest Number in the array " + Arrays.toString(arr) + " is :- " + findLargestElementInAnArray(arr));
        sc.close();
    }
}

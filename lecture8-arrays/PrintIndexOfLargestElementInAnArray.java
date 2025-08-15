import java.util.Arrays;
import java.util.Scanner;

public class PrintIndexOfLargestElementInAnArray {
    public static int findIndexOfLargestElementInAnArray(int arr[]) {
        int largestElement = Integer.MIN_VALUE;
        int indexOfLargestElement = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestElement) {
                largestElement = arr[i];
                indexOfLargestElement = i;
            }
        }

        return indexOfLargestElement;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array :- ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Index of Largest Number in an array " + Arrays.toString(arr) + " is :- " + findIndexOfLargestElementInAnArray(arr));
        sc.close();
    }
}

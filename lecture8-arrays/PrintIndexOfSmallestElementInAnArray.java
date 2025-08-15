import java.util.Arrays;
import java.util.Scanner;

public class PrintIndexOfSmallestElementInAnArray {
    public static int findIndexOfSmallestElementInAnArray(int arr[]) {
        int smallestElement = Integer.MAX_VALUE;
        int indexOfSmallestElement = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallestElement) {
                smallestElement = arr[i];
                indexOfSmallestElement = i;
            }
        }

        return indexOfSmallestElement;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array :- ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Index of Smallest Number in an array " + Arrays.toString(arr) + " is :- " + findIndexOfSmallestElementInAnArray(arr));
        sc.close();
    }
}

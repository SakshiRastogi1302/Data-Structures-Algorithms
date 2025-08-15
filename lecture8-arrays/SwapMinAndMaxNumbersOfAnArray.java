import java.util.Arrays;
import java.util.Scanner;

public class SwapMinAndMaxNumbersOfAnArray {
    public static int findMaxNumberInAnArray(int arr[]) {
        int maxValue = Integer.MIN_VALUE;
        int maxValueIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxValueIndex = i;
            }
        }

        return maxValueIndex;
    }

    public static int findMinNumberInAnArray(int arr[]) {
        int minValue = Integer.MAX_VALUE;
        int minValueIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minValueIndex = i;
            }
        }

        return minValueIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array :- ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxNoIndex = findMaxNumberInAnArray(arr);
        int minNoIndex = findMinNumberInAnArray(arr);

        int a = arr[maxNoIndex];
        int c = a;

        arr[maxNoIndex] = arr[minNoIndex];
        arr[minNoIndex] = c;

        System.out.println(Arrays.toString(arr));
    }
}

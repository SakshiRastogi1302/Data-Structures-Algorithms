import java.util.Scanner;
import java.lang.Math;

public class MaximumSubarraySumUsingBruteForceApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value at index " + i + " :- ");
            arr[i] = sc.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < n; start++) {
            int currSum = 0;
            for (int end = start; end < n; end++) {
                currSum += arr[end];
                maxSum = Math.max(maxSum, currSum);
            }
        }

        System.out.println(maxSum);
        sc.close();
    }
}

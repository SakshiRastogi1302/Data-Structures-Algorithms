import java.util.Scanner;

public class MaximumSubarraySumUsingKadanesAlgorithm {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array :- ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at index " + i + " :- ");
            arr[i] = sc.nextInt();
        }

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                for (int val = start; val <= end; val++) {
                    System.out.print(arr[val]);
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        sc.close();

    }
}

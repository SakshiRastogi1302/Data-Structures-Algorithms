import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
    public static void swap(int arr[], int idx1, int idx2) {
        int a = arr[idx1];
        int c = a;
        arr[idx1] = arr[idx2];
        arr[idx2] = c;
    }
    public static void reverseAnArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        reverseAnArray(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }   
}

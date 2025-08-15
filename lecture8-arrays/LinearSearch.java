import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array :- ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the target element :- ");
        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Index of target element in an array is :- " + linearSearch(arr, target));
        sc.close();
    }
}

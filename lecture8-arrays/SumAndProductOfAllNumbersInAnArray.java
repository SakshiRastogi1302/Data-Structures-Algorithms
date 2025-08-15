
import java.util.Scanner;

public class SumAndProductOfAllNumbersInAnArray {

    public static int productOfAllElementsInAnArray(int arr[]) {
        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }

        return product;
    }

    public static int sumOfAllElementsInAnArray(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array :- ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The product of all the elements in an array is :- " + productOfAllElementsInAnArray(arr));
        System.out.println("The sum of all the elements in an array is :- " + sumOfAllElementsInAnArray(arr));
    }
}
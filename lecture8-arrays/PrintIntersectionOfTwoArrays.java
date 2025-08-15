import java.util.Scanner;

public class PrintIntersectionOfTwoArrays {
    public static void printIntersectionOfTwoArrays(int arr1[], int arr2[]) {
        for(int i=0;i<arr1.length;i++){
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array 1 :- ");
        int n1 = sc.nextInt();

        int arr1[] = new int[n1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the array 2 :- ");
        int n2 = sc.nextInt();

        int arr2[] = new int[n2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        printIntersectionOfTwoArrays(arr1, arr2);
        
        sc.close();
    }
}

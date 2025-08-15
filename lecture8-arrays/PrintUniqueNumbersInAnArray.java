import java.util.Scanner;

public class PrintUniqueNumbersInAnArray {

    public static void printUniqueElementsInAnArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if ((i != j && arr[i] == arr[j])) {
                    isUnique = false;
                }
            }
            if (isUnique) {
                System.out.print(arr[i]+" ");
            }
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

        printUniqueElementsInAnArray(arr);

        sc.close();
    }
}

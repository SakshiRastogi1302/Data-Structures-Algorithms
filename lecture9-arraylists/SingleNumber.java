import java.util.Scanner;

public class SingleNumber {

    public static int findSingleNumber(int arr[]) {
        int xorBit = 0;
        
        for (int i = 0; i < arr.length; i++) {
            xorBit = xorBit ^ arr[i];
        }
        
        return xorBit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findSingleNumber(arr));
    }
}

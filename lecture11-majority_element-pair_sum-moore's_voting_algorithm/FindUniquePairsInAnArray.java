import java.util.Scanner;

public class FindUniquePairsInAnArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array :- ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i < n; i++){
            System.out.print("Enter the value at index "+i+" :- ");
            arr[i] = sc.nextInt();
        }


        for(int i=0; i < n; i++){
            for(int j=i+1; j < n; j++){
                System.out.print("( "+arr[i] +","+arr[j]+" ) ");
            }
            System.out.println();
        }

    }
}

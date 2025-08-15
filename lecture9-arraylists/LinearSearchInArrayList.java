import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchInArrayList {
    public static int linearSearch(ArrayList<Integer> al, int target) {

        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == target) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arraylist :- ");
        int n = sc.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            al.add(num);
        }

        System.out.print("Enter the target element :- ");
        int target = sc.nextInt();


        
        System.out.println("Index of target element in an array is :- " + linearSearch(al, target));
        sc.close();
    }
}

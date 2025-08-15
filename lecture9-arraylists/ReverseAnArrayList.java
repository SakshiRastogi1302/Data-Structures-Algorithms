
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseAnArrayList {
    public static void reverseAnArrayList(ArrayList<Integer> al) {
        int i = 0;
        int j   = al.size ( ) - 1;
     
  
        while (i < j) {
            int c = al.get(i);
            al.set(i,al.get(j));
            al.set(j, c);
            i++;
            j--;
        }

        for(Integer num:al){
            System.out.print(num+" ");
        }

    
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

        reverseAnArrayList(al);

        sc.close();
    }
}

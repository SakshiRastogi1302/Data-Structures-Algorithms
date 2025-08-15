import java.util.Scanner;

public class TakeArrayInputUsingLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :- ");
        int n = sc.nextInt();

        int marks[] = new int[n];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the number stored at index "+ i+" :- ");
            marks[i] = sc.nextInt();
        }

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }

    }
}

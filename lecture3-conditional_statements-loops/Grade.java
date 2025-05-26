import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks scored by student :- ");
        int marks = sc.nextInt();

        if (marks > 90) {
            System.out.println("Grade is A");
        } else if (marks >= 80 && marks <= 90) {
            System.out.println("Grade is B");
        } else {
            System.out.println("Grade is C");
        }

        sc.close();
    }
}

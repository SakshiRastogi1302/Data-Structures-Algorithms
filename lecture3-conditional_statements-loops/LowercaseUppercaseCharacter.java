import java.util.Scanner;

public class LowercaseUppercaseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character :- ");
        char c = sc.next().charAt(0);

        // Approach 1
        // if (c >= 65 && c <= 90) {
        //     System.out.println(c + " is an uppercase character.");
        // } else if (c >= 97 && c <= 122) {
        //     System.out.println(c + " is a lowercase character.");
        // } else {
        //     System.out.println(c + " is neither an uppercase nor lowercase character.");
        // }

        // Approach 2

        if (c >= 'A' && c <= 'Z') {
            System.out.println(c + " is an uppercase character.");
        } else if (c >= 'a' && c <= 'z') {
            System.out.println(c + " is a lowercase character.");
        } else {
            System.out.println(c + " is neither an uppercase nor lowercase character.");
        }
        sc.close();
    }
}

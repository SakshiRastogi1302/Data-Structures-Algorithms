import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        System.out.println(n+" is a "+((n>=0)?"positive":"negative")+" number.");
        sc.close();
    }}

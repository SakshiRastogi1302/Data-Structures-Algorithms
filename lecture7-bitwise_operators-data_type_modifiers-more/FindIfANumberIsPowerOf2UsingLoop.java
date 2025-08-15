import java.util.Scanner;

public class FindIfANumberIsPowerOf2UsingLoop {
    public static boolean findIfANumberIsPowerOf2(int n) {
        while(n>1){
            if(n%2==1){
                return false;
            }

            n=n/2;
        }

        return true;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        System.out.println(findIfANumberIsPowerOf2(n));
        sc.close();
    }
}

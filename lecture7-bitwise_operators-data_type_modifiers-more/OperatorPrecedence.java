public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(5 - 2 * 6);
        System.out.println((5 - 2) * 6); // Firstly parentheses expression is executed.     
        System.out.println(4*5%2); // Based on associativity, we will execute the expression from left to right.
    }
}

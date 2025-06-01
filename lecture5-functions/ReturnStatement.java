public class ReturnStatement {
    static void func1() {
        System.out.println("Hello");
        return;
    }

    static int func2() {
        return 4;
        // System.out.println("Hello"); //Unreachable Statement
    }
    public static void main(String[] args) {
        func1();
        System.out.println(func2());
    }
}

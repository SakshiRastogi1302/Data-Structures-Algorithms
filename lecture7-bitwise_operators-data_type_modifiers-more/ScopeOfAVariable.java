public class ScopeOfAVariable {

    // Global Variable
    static int m = 10;

    public static void func() {
        int y = 10;
        System.out.println(y);
    }

    public static void main(String[] args) {
        if (3 > 1) {
            // Local Variable
            int x = 10;
            System.out.println(m);
            System.out.println("Inside if :- " + x);
        }

        System.out.println(x);

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }

        // Local Variable
        System.out.println(i);

        func();

        // Local Variable
        System.out.println(y);
    }
}

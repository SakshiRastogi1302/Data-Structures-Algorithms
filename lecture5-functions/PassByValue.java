public class PassByValue {
    public static int sum(int a, int b) {
        System.out.println(a + " " + b);
        a = a + 10;
        b = b + 10;
        System.out.println(a + " " + b);
        return a+b;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        System.out.println(a+" "+b);
        System.out.println(sum(a,b));
    }
}

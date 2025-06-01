
public class UseOfUndeclaredIdentifier{
    static void func(){
        int x = 25;
        System.out.println("Value of x in func function is :- "+x);
    }
    public static void main(String[] args){
        func();
        System.out.println("Value of x in main function is :- "+x);
    }
}
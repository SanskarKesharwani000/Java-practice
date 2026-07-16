import java.io.Console;

class A {
    public static void main(String[] args) {
        Console a = System.console();
        Console b = System.console();
        Console c = System.console();

        System.out.println(a == b);
        System.out.println(c == b);
        System.out.println(c == a);
    }
}
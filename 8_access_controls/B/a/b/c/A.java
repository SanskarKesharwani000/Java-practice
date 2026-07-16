// private variable of a class is not accessible outside the class.

package a.b.c;

public class A {
    private int y = 55;

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y);
    }
}

class X {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y);
    }
}
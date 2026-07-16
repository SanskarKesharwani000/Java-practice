// This example shows that if there is a class in same folder and folder structure so first preference will be given to the same file class.

class A {
    public static void main(String[] args) {
        B a = new B();

        System.out.println(a.y);
    }
}

class B {
    int y = 2;
}
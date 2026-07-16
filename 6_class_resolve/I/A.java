// we can call different methods of different class from different files

class A {
    public static void main(String[] args) {
        B x = new B();

        C y = new C();

        x.pro();
        y.info();
    }
}
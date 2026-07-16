// to import a class we can use another method which is importing when it is used in every line

package a;

// import x.B;
// import x.y.C;

class A {
    public static void main(String[] args) {
        System.out.println("------");
        x.B a = new x.B();

        x.y.C b = new x.y.C();
    }
}
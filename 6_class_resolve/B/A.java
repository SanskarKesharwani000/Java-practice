// if class is not found in same file then compiler searches it for same package

class A {
    public static void main(String[] args) {
        B a = new B();

        System.out.println(a.y);
    }
}

// class B {
//     int y = 2;
// }
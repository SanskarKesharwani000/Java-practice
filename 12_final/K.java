// A final class behaves normal as another class but only it is not inheritable
final class K1 {
    int y = 99;

    void pro() {
        System.out.println("Hi");
    }
}

class K {
    public static void main(String[] args) {
        K1 a = new K1();

        System.out.println(a.y);

        a.pro();
    }
}

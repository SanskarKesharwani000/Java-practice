// A final class behaves normal as another class but only it is not inheritable

final class J1 {
    static int y = 2;

    static void pro() {
        System.out.println("Hello");
    }
}

class J {
    public static void main(String[] args) {
        System.out.println(J1.y);

        J1.pro();
    }
}

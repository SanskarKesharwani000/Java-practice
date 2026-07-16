class X4 {
    final static int y = 123;

    static final void pro() {
        System.out.println("Namaskar");
    }
}

class X3 extends X4 {
    public static void main(String[] args) {
        System.out.println(X3.y);

        X3.pro();
    }
}

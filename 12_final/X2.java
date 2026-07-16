class X3 {
    final static int y = 90;

    static final void pro() {
        System.out.println("Hellooooooooooo!!");
    }
}

class X2 {
    public static void main(String[] args) {
        System.out.println(X3.y);

        X3.pro();
    }
}

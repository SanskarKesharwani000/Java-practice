interface H1 {
    void pro();
}

class H2 implements H1 {
    public void pro() {
        System.out.println("Hello");
    }
}

class H {
    public static void main(String[] args) {
        H1 x = new H2();

        x.pro();
    }
}

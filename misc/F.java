class F {
    int y;

    static void pro(F a) {
        System.out.println(a.y);
    }

    void info() {
        pro(this);
    }

    public static void main(String[] args) {
        F x = new F();
        x.y = 999;
        x.info();

        F x1 = new F();
        x1.y = 888;
        x1.info();
    }
}
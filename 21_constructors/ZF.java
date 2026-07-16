class ZF1 {
    private int y = 112;

    void pro() {
        System.out.println(y);
    }
}

class ZF extends ZF1 {
    int y = 99;

    public static void main(String[] args) {
        ZF a = new ZF();

        a.pro();
        System.out.println(a.y);
    }
}

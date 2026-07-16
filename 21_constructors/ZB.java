class ZB1 {
    int q;

    void info() {

    }
    
    ZB1(int y) {

    }
}

class ZB extends ZB1 {
    ZB() {
        super(abc());
    }

    static int abc() {
        return 12;
    }

    public static void main(String[] args) {
        new ZB();
    }
}
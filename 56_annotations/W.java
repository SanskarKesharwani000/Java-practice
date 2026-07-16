@Deprecated
class W1 {
    @Deprecated
    static void process() {
        System.out.println("Hello");
    }

    @Deprecated
    static int y = 90;

    @Deprecated
    W1() {

    }
}

class W {
    public static void main(String[] args) {
        W1.process();

        System.out.println(W1.y);

        W1 x = new W1();

        W1 y;
    }
}

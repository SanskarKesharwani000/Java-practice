// the value of instance variable can be initialized in the instance method or inside the constructor.

class L {
    int y;

    void pro() {
        y = 34;
        System.out.println(y);
    }

    L() {
        y = 87;

        System.out.println(y);
    }
}
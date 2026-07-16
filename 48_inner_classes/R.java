abstract class DD {
    abstract void pro();
}

class EE extends DD {
    void pro() {
        System.out.println("Hi");
    }
}

class R {
    public static void main(String[] args) {
        DD x = new EE();

        x.pro();
    }
}

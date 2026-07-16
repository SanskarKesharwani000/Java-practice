class V1 {
    void pro() {
        System.out.println("Hello");
    }
}

class V extends V1 {
    void pro() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        V x = new V();

        x.pro();
    }
}

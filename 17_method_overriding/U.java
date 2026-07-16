class U1 {
    void pro() {
        System.out.println("Hello");
    }
}

class U extends U1 {
    void pro() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        U1 x = new U1();

        x.pro();
    }
}

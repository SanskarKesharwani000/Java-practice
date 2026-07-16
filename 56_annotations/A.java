class A1 {
    void process() {
        System.out.println("Hello");
    }
}

class A extends A1 {
    void pracess() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        A1 x = new A();
        x.process();
    }
}
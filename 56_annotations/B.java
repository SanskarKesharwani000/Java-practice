class B1 {
    void process() {
        System.out.println("Hello");
    }
}

class B extends B1 {
    @Override
    void pracess() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        B1 x = new B();
        x.process();
    }
}


// B.java:8: error: method does not override or implement a method from a supertype
//     @Override
//     ^
// 1 error
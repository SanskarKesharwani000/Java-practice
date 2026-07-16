class D1 {
    void process(int a, String b, boolean c) {
       System.out.println("Hello"); 
    }
}

class D extends D1 {
    @Override
    void process(String a, int b, boolean c) {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        D1 x = new D();

        x.process(12, "om", true);
    }    
}


// D.java:8: error: method does not override or implement a method from a supertype
//     @Override
//     ^
// 1 error

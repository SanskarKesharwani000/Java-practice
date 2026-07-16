class C1 {
    void process(int a, String b, boolean c) {
       System.out.println("Hello"); 
    }
}

class C extends C1 {

    void process(String a, int b, boolean c) {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        C1 x = new C();

        x.process(12, "om", true);
    }    
}

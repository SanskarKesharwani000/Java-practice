class C {
    public static void main(String[] args) {
        C2.bbb();
    }   
}

class C1 {
    static void aaa() {
        C3.ccc();
    } 
}
    
class C2 {
    static void bbb() {
        C1.aaa();
    }
}

class C3 {
    static void ccc() {
        System.out.println("----- start");

        int y = 12/0;

        System.out.println("----- end");
    }
}



// ----- start
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at C3.ccc(C.java:23)
//         at C1.aaa(C.java:9)
//         at C2.bbb(C.java:15)
//         at C.main(C.java:3)
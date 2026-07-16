// We can access instance method of that class from object of that class

class I {
    public static void main(String[] args) {
        I1 a = new I1();
        
        a.pro();  // Access Through Instantiation

        // I1.pro();  // not ok
    }
}

class I1 {
    void pro() {
        System.out.println("Namaste");
    }
}
// from object of that class we can access static method of that class but compiler replaces object name with class name when we call it.

class I {
    public static void main(String[] args) {
        I z = new I();        
        
        z.pro();
    }   
    
    static void pro() {
        System.out.println("Hi");
    }
}

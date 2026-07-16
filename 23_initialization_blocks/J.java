// static initialization block runs the code when class is loaded.

class J {
    static {
        System.out.println("Hello");
    }    

    public static void main(String[] args) {
        System.out.println("main start");
        
        J x = new J();
        J y = new J();
        J z = new J();

        System.out.println("main end");
    }
}

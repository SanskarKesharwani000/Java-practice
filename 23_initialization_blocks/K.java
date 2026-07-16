// static initialization block runs in order in which they are created.

class K {
    static {
        System.out.println("Hello");
    }    

    public static void main(String[] args) {
        System.out.println("main start");
        
        K x = new K();
        K y = new K();
        K z = new K();

        System.out.println("main end");
    }

    static {
        System.out.println("Hi");
    }
}

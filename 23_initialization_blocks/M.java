// static initialization block of parent runs first.

class M1 {
    static {
        System.out.println("Hi");
    } 
}

class M extends M1 {
    static {
        System.out.println("Hello");
    }    

    public static void main(String[] args) {
        System.out.println("main start");
        M x = new M();
        M y = new M();
        System.out.println("main end");
    }
}

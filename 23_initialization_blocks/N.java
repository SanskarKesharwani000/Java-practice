class N1 {
    static {
        System.out.println("Hi");
    }
    
    {
        System.out.println("B");
    }
}

class N extends N1 {
    static {
        System.out.println("Hello");
    }    

    {
        System.out.println("A");
    }

    public static void main(String[] args) {
        System.out.println("main start");
        N x = new N();
        N y = new N();
        System.out.println("main end");
    }
}

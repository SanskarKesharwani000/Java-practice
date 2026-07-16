class L {
    static {
        System.out.println("Hi");
    }   

    {
        System.out.println("Namaskar");
    }    

    public static void main(String[] args) {
        System.out.println("main start");        
        L x = new L();
        System.out.println("main end");
    }

    {
        System.out.println("Namaste");        
    }

    static {
        System.out.println("Hello");        
    }
}

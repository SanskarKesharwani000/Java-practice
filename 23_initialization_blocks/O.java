class O1 {
    static {
        System.out.println("Yam");
    }

    O1() {
        System.out.println("S");  
    }
    
    {
        System.out.println("B");
    }
}

class O extends O1 {
    static {
        System.out.println("Indra");
    }
    
    O() {
        System.out.println("J");  
    }

    {
        System.out.println("A");
    }

    public static void main(String[] args) {
        System.out.println("main start");
        O x = new O();
        O y = new O();
        System.out.println("main end");
    }
}

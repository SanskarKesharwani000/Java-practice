class L1 {
    // Early Initialization
    // private static L1 x = new L1();

    private static L1 x;
    
    private L1() {

    }

    // Lazy Initialization
    static L1 createObject() {
        if(x == null)
            x = new L1();

        return x;
    }
}

class L {
    public static void main(String[] args) {
        L1 x1 = L1.createObject(); 
        L1 x2 = L1.createObject(); 
        L1 x3 = L1.createObject();
        
        System.out.println(x1 == x2);
        System.out.println(x3 == x2);
        System.out.println(x3 == x1);
    }
}

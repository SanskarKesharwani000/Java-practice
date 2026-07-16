class K1 {
    // Early Initialization
    private static K1 x = new K1();
    
    private K1() {

    }

    static K1 createObject() {
        return x;
    }
}

class K {
    public static void main(String[] args) {
        K1 x1 = K1.createObject(); 
        K1 x2 = K1.createObject(); 
        K1 x3 = K1.createObject();
        
        System.out.println(x1 == x2);
        System.out.println(x3 == x2);
        System.out.println(x3 == x1);
    }
}

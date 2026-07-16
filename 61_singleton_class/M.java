final class M1 {
    // Early Initialization
    private final static M1 x;
    
    static {
        x = new M1();
    }

    private M1() {

    }

    static M1 createObject() {
        return x;
    }
}

class M {
    public static void main(String[] args) {
        M1 x1 = M1.createObject(); 
        M1 x2 = M1.createObject(); 
        M1 x3 = M1.createObject();
        
        System.out.println(x1 == x2);
        System.out.println(x3 == x2);
        System.out.println(x3 == x1);
    }
}

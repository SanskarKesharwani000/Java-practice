final class N1 {
    // Early Initialization
    private final static N1 x = new N1();

    private N1() {
        if(x != null)
            throw new RuntimeException("You can't create another object of a singleton class...");
    }

    static N1 createObject() {
        return x;
    }
}

class N {
    public static void main(String[] args) {
        N1 x1 = N1.createObject(); 
        N1 x2 = N1.createObject(); 
        N1 x3 = N1.createObject();
        
        System.out.println(x1 == x2);
        System.out.println(x3 == x2);
        System.out.println(x3 == x1);
    }
}

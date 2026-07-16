class J1 {
    private J1() {

    }

    static J1 createObject() {
        return new J1();
    }
}

class J {
    public static void main(String[] args) {
        J1 x1 = J1.createObject(); 
        J1 x2 = J1.createObject(); 
        J1 x3 = J1.createObject();
        
        System.out.println(x1 == x2);
        System.out.println(x3 == x2);
        System.out.println(x1 == x2);
    }
}

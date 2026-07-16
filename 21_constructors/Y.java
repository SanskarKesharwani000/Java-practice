class Y1 {
    static int z = 89;
    Y1(int y) {

    }
}

class Y extends Y1 {
    int n = 12;
    
    Y() {
        // super(n);
        super(12);

        System.out.println(n);
    }    

    public static void main(String[] args) {
        new Y();
    }
}

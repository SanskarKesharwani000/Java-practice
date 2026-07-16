class Y1 {
    static int abc = 8;
}

class Y extends Y1 {
    static int abc = 23;
}

class B {
    public static void main(String[] args) {
        Y1 z = new Y();

        System.out.println(z.abc);
    }    
}

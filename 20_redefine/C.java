class Z1 {
    void pro() {
        System.out.println("Hi");
    }
}

class Z extends Z1 {
    void pro() {
        System.out.println("Hello");
    }
}

class C {
    public static void main(String[] args) {
        Z1 x = new Z();

        x.pro();
    }        
}

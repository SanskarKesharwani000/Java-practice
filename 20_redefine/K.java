class K1 {
    void pro() {
        System.out.println("Hi");
    }
}

class K extends K1 {
    void pro() {
        System.out.println("Hello");
    }
    
    void info() {
        pro();
        super.pro();
    }

    public static void main(String[] args) {
        K x = new K();

        x.info();
    }
}

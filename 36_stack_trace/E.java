class E {
    E() {
        this(12);
    }

    E(String x) {
        int y = 12 / 0;
    }

    E(int y) {
        this("om");
    }

    public static void main(String[] args) {
        E x = new E();    
    }    
}

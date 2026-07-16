class W1 {
    void pro() {
        System.out.println("Hello");
    }
}

class W extends W1 {
    void pro() {
        System.out.println("Namaste");
    }    

    public static void main(String[] args) {
        W1 x = new W();

        x.pro();  // Dynamic Method Dispatch (Runtime Ploymorphism)
    }
}

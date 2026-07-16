// using inheritance we can access static method of another class with the class name of our class.

class L extends L1 {
    public static void main(String[] args) {
        L.info();
    }
}

class L1 {
    static void info() {
        System.out.println("Helloooooooo!");
    }
}
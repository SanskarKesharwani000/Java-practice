class T1 {
    static void info() {
        System.out.println("Namaste");
    }
}

class T extends T1 {
    static void info() {
        System.out.println("Namaskar");
    }
}

class D {
    public static void main(String[] args) {
        T1 h = new T();

        h.info();
    }    
}

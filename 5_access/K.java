// We cannot access static method of another class with the class name of our class without inheritance.

class K {
    public static void main(String[] args) {
        K.info();
    }
}

class K1 {
    static void info() {
        System.out.println("Yamraj");
    }
}


// K.java:3: error: cannot find symbol
//         K.info();
//          ^
//   symbol:   method info()
//   location: class K
// 1 error

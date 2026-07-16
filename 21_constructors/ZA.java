class ZA1 {
    int q;

    void info() {

    }
    
    ZA1(int y) {

    }
}

class ZA extends ZA1 {
    ZA() {
        super(abc());
    }

    int abc() {
        return 12;
    }

    public static void main(String[] args) {
        new ZA();
    }
}


// ZA.java:15: error: cannot reference this before supertype constructor has been called
//         super(abc());
//               ^
// 1 error
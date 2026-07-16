class S1 {
    private S1() {

    }

    S1 getInstance() {
        return new S1();
    }
}

class S {
    public static void main(String[] args) {
        S1 y = new S1();
        S1 x = y.getInstance();
    }
}

// S.java:13: error: S1() has private access in S1
//         S1 y = new S1();
//                ^
// 1 error

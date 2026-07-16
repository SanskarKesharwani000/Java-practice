// We cannot use a local level variable without initializing it.

class Y1 {
    void pro() {
        int x;
        int y = 7;

        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        Y1 y = new Y1();

        y.pro();
    }
}

// Y1.java:6: error: variable x might not have been initialized
//         System.out.println(x);
//                            ^
// 1 error
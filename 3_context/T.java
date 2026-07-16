// local level variable cannot be accessed outside the method scope.

class T {
    public static void main(String[] args) {
        pro();

        System.out.println(y);
    }

    static void pro() {
        int y = 90;
    }
}


// T.java:5: error: cannot find symbol
//         System.out.println(y);
//                            ^
//   symbol:   variable y
//   location: class T
// 1 error
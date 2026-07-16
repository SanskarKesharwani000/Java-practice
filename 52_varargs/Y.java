class X1 {
    void pro(int... x) {

    }
}

class Y extends X1 {
    // ok
    void pro(int[] x) {
        System.out.println("Hello");
    }

    // not ok 
    // int pro(int[] x) {
    //     return 0;
    // }
}

// Y.java:14: error: pro(int[]) in Y cannot override pro(int...) in X1
//     int pro(int[] x) {
//         ^
//   return type int is not compatible with void
// 1 error

class A1 {
    static void pro() {

    }
}

class A extends A1 {
    void pro() {

    }
}


// A.java:8: error: pro() in A cannot override pro() in A1
//     void pro() {
//          ^
//   overridden method is static
// 1 error
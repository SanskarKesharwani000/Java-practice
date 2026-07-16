class Z1 {
    void pro() {

    }
}

class Z extends Z1 {
    static void pro() {

    }
}


// Z.java:8: error: pro() in Z cannot override pro() in Z1
//     static void pro() {
//                 ^
//   overriding method is static
// 1 error
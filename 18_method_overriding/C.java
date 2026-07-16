class C1 {
    static void pro() {

    }
}

class C extends C1 {
    static int pro() {
        return 1;
    }
}


// C.java:8: error: pro() in C cannot hide pro() in C1
//     static int pro() {
//                ^
//   return type int is not compatible with void
// 1 error

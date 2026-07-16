class J1 {
    int pro() {
        return 2;
    }
}

class J extends J1 {
    long pro() {
        return 23;
    }
}



// J.java:8: error: pro() in J cannot override pro() in J1
//     long pro() {
//          ^
//   return type long is not compatible with int
// 1 error

class H1 {
    int pro() {
        return 1;
    }
}

class H extends H1 {
    // illegal method overriding... compilation will fail... (return type mismatched)
    byte pro() {
        byte x = 2;

        return x;
    }
}


// H.java:9: error: pro() in H cannot override pro() in H1
//     byte pro() {
//          ^
//   return type byte is not compatible with int
// 1 error
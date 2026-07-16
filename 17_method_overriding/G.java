class G1 {
    void pro() {

    }
}


class G extends G1 {
    // illegal method overriding... compilation will fail... (return type mismatched)
    int pro() {
        return 90;
    }
}



// G.java:10: error: pro() in G cannot override pro() in G1
//     int pro() {
//         ^
//   return type int is not compatible with void
// 1 error
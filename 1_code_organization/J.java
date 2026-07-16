// We cannot call the method directly inside the class

class J {
    // one can define or declare methods directly inside a class
    void pro() {

    }

    // function call is not allowed directly inside a class
    pro();
}


// J.java:8: error: invalid method declaration; return type required
//     pro();
//     ^
// 1 error

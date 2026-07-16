class U {
    U() {
        this(2);
    }   
    
    U(int x) {
        this();
    }
}


// U.java:2: error: recursive constructor invocation
//     U() {
//     ^
// 1 error
class Q1 {
    private Q1() {

    }
}

class Q extends Q1 {
    Q() {
        super();
    }
}



// Q.java:9: error: Q1() has private access in Q1
//         super();
//         ^
// 1 error
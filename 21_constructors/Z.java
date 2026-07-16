class Z1 {
    int s = 56;

    Z1(int n) {

    }
}

class Z extends Z1 {
    Z() {
        super(s);
    }
}

// Z.java:11: error: cannot reference s before supertype constructor has been called
//         super(s);
//               ^
// 1 error

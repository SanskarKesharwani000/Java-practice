class H1 {
    private H1() {

    }
}

class H {
    public static void main(String[] args) {
        H1 x = new H1();
    }
}


// H.java:9: error: H1() has private access in H1
//         H1 x = new H1();
//                ^
// 1 error
class R1 {
    private R1() {

    }
}

class R {
    public static void main(String[] args) {
        R1 a = new R1();
    }
}


// R.java:9: error: R1() has private access in R1
//         R1 a = new R1();
//                ^
// 1 error
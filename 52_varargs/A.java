class A {
    static void pro() {
        System.out.println("pro()");
    }

    public static void main(String[] args) {
        // pro();
        pro(12);
    }
}


// A.java:8: error: method pro in class A cannot be applied to given types;
//         pro(12);
//         ^
//   required: no arguments
//   found:    int
//   reason: actual and formal argument lists differ in length
// 1 error
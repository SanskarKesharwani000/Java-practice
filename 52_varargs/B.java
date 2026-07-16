class B {
    static void pro(int x) {
        System.out.println("pro() " + x);
    } 

    public static void main(String[] args) {
        // pro(12);
        pro();
    }    
}


// B.java:8: error: method pro in class B cannot be applied to given types;
//         pro();
//         ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error
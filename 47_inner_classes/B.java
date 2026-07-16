class B {
    // instance level member class(X1) of it's outer class(B)
    class X1 {

    }   
    
    public static void main(String[] args) {
        X1 y = new X1();
    }
}


// B.java:7: error: non-static variable this cannot be referenced from a static context
//         X1 y = this.new X1();
//                ^
// 1 error

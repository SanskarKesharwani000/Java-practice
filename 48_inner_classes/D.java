class D {
    void pro() {
        class X1 {

        }
    }   
    
    public static void main(String[] args) {
        D x = new D();

        x.pro();

        X1 w;
    }
}


// D.java:13: error: cannot find symbol
//         X1 w;
//         ^
//   symbol:   class X1
//   location: class D
// 1 error
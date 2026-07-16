class D {
    // you will not get a defualt constructor if you defined your own...
    D(int y) {

    }   
    
    public static void main(String[] args) {
        D x = new D();
    }
}


// D.java:8: error: constructor D in class D cannot be applied to given types;
//         D x = new D();
//               ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error


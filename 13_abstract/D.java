// We cannot call constructor of an abstract class

abstract class D {
    abstract void pro();
    
    public static void main(String[] args) {
        // Case 1:
        D x;  // ok

        // Case 2:
        D y = new D();
    }
}


// D.java:8: error: D is abstract; cannot be instantiated
//         D y = new D();
//               ^
// 1 error
// we cannot declare a method inside interface because every method in interface is marked as public abstract.

interface D {
    void pro() {

    }
}



// D.java:2: error: interface abstract methods cannot have body
//     void pro() {
//                ^
// 1 error
// We cannot assign value of static variable inside the constructor.

class V2 {
    final static int y;

    V2() {
        y = 9;
    }
}


// V2.java:5: error: cannot assign a value to final variable y
//         y = 9;
//         ^
// 1 error
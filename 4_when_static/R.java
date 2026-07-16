// static keyword cannot be applied in local level variable.

class R {
    void pro() {
        static int y;
    }    
}


// R.java:3: error: illegal start of expression
//         static int y;
//         ^
// R.java:5: error: class, interface, enum, or record expected
// }
// ^
// 2 errors
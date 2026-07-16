// final variable value cannot be reinitialized inside a  constructor

class Q {
    final int y;
    
    Q() {
        y = 8;

        y = 12; // not ok
    }
}


// Q.java:7: error: variable y might already have been assigned
//         y = 12;
//         ^
// 1 error
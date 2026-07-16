// instance variable value cannot be reintialized inside the constructor

class R {
    final int y = 90;
    
    R() {
        y = 120;
    }
}


// R.java:5: error: cannot assign a value to final variable y
//         y = 120;
//         ^
// 1 error
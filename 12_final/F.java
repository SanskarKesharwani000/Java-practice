// if an instance variable is marked final so we cannot change value of that variable.

class F {
    final int y = 90;
    
    void pro() {
        System.out.println(y);
        y = 56;
    }
}



// F.java:6: error: cannot assign a value to final variable y
//         y = 56;
//         ^
// 1 error
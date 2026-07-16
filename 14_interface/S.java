// We have to implement all declared methods of interface 

interface S1 {
    void info();
    void pro();
}


class S implements S1 {
    public void info() {

    }
}


// S.java:7: error: S is not abstract and does not override abstract method pro() in S1
// class S implements S1 {
// ^
// 1 error

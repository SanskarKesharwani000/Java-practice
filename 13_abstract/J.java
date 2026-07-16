// We have to implement all abstract methods from subclass.

abstract class J1 {
    abstract void pro();

    abstract void info();
}

class J extends J1 {
    void info() {
        //----
    }    
}



// J.java:7: error: J is not abstract and does not override abstract method pro() in J1
// class J extends J1 {
// ^
// 1 error

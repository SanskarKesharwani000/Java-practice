// If a class has abstract method then it's subclass should implement that abstract method

abstract class F1 {
    abstract void pro();    
}

class F extends F1 {

    public static void main(String[] args) {
        
    }
}


// F.java:5: error: F is not abstract and does not override abstract method pro() in F1
// class F extends F1 {
// ^
// 1 error
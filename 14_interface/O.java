// a declared method in interface should be defined inside it's child implemented class.

interface O1 {
    void pro();
}

class O implements O1 {
        
}


// O.java:5: error: O is not abstract and does not override abstract method pro() in O1
// class O implements O1 {
// ^
// 1 error
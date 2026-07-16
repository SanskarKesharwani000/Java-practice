// to implement a declared method inside the class we have to follow all overriding rules.

interface Q1 {
    void pro();
}

class Q implements Q1 {
    void pro() {

    }    
}


// Q.java:6: error: pro() in Q cannot implement pro() in Q1
//     void pro() {
//          ^
//   attempting to assign weaker access privileges; was public
// 1 error

class N1 {
    void pro() {

    }
}

// class N extends N1 {
//     void pro() {

//     }
// }
class N extends N1 {
    private void pro() {

    }
}


// N.java:13: error: pro() in N cannot override pro() in N1
//     private void pro() {
//                  ^
//   attempting to assign weaker access privileges; was package
// 1 error

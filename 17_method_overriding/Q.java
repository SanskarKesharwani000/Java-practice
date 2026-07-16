class Q1 {
    protected void pro() {

    }
}

//ok
// class Q extends Q1 {
//     protected void pro() {

//     }
// }

//ok
// class Q extends Q1 {
//     public void pro() {

//     }
// }

// not ok
// class Q extends Q1 {
//     void pro() {

//     }
// }

// Q.java:21: error: pro() in Q cannot override pro() in Q1
//     void pro() {
//          ^
//   attempting to assign weaker access privileges; was protected
// 1 error

// not ok 
class Q extends Q1 {
    private void pro() {

    }
}


// Q.java:36: error: pro() in Q cannot override pro() in Q1
//     private void pro() {
//                  ^
//   attempting to assign weaker access privileges; was protected
// 1 error
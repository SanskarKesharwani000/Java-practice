class R1 {
    public void pro() {

    }
}

// ok
// class R extends R1 {
//     public void pro() {
        
//     }
// }

// not ok
// class R extends R1 {
//     protected void pro() {

//     }
// }

// R.java:16: error: pro() in R cannot override pro() in R1
//     protected void pro() {
//                    ^
//   attempting to assign weaker access privileges; was public
// 1 error

// not ok
class R extends R1 {
    void pro() {

    }
}

// R.java:28: error: pro() in R cannot override pro() in R1
//     void pro() {
//          ^
//   attempting to assign weaker access privileges; was public
// 1 error
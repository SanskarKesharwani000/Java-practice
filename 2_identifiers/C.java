// identifier name cannot contain # inside it .

class C {
    void pro#info() {

    }
}


// C.java:2: error: illegal character: '#'
//     void pro#info() {
//             ^
// C.java:2: error: invalid method declaration; return type required
//     void pro#info() {
//              ^
// 2 errors
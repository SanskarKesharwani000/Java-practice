class K1 {
    Animal pro() {
        return null;
    }    
}

//ok
// class K extends K1 {
//     Animal pro() {
//         return null;
//     }
// }

//not ok
class K extends K1 {
    // Illegal Method Overriding... Return Type Mismatched
    Bus pro() {
        return null;
    }
}


// K.java:14: error: pro() in K cannot override pro() in K1
//     Bus pro() {
//         ^
//   return type Bus is not compatible with Animal
// 1 error
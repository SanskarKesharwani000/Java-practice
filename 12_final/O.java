// If we do not initialize a final instance variable then we shall initialize it in constructor otherwise it gives error

class O {
    final int x;
    
    O() {

    }
}


// O.java:6: error: variable x might not have been initialized
//     }
//     ^
// 1 error
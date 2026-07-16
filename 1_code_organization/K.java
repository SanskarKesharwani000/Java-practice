// We cannot call the constructor directly inside the class.

class K {
    K() {

    }

    new K();
}


// K.java:6: error: illegal start of type
//     new K();
//     ^
// 1 error
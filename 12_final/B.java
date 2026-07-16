// final keyword can only be marked in class, method,variables not in construcotr.

// if a class is marked final then it cannot be inherited.
final class B1 {

}

class B extends B1 {
    
}


// B.java:5: error: cannot inherit from final B1
// class B extends B1 {
//                 ^
// 1 error
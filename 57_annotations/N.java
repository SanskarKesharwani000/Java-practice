@interface NN {
    String name();
    int age();
}

@NN
class N {
    
}


// N.java:6: error: annotation @NN is missing default values for elements name,age
// @NN
// ^
// 1 error
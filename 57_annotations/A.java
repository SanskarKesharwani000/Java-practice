@interface AA {

}

class A {
    @AA
    {

    }

    @AA
    static {

    }
}



// A.java:7: error: illegal start of type
//     {
//     ^
// A.java:12: error: illegal start of type
//     static {
//            ^
// 2 errors
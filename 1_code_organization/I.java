// We cannot declare and initialize variable differently inside the class.

class I {
    // variable type declaration
    int y; 

    // variable type declaration cum initialization
    int x = 99;
    
    // you can't read or write a variable directly inside your class
    y = 90;
}


// I.java:9: error: <identifier> expected
//     y = 90;
//      ^
// 1 error
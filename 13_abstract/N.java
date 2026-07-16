// cannot mark a static method as abstract.

abstract class N {
    abstract static void pro();        
}


// N.java:2: error: illegal combination of modifiers: abstract and static
//     abstract static void pro();
//                          ^
// 1 error

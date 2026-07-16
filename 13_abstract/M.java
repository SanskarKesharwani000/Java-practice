// cannot mark abstract method as final

abstract class M {
    abstract final void pro();    
}



// M.java:2: error: illegal combination of modifiers: abstract and final
//     abstract final void pro();
//                         ^
// 1 error
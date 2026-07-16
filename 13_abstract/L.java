// abstract method cannot be marked private because it will be implemented by it's subclass

abstract class L {
    abstract private void pro();    
}


// L.java:2: error: illegal combination of modifiers: abstract and private
//     abstract private void pro();
//                           ^
// 1 error

interface C1 {
    
}

// not ok
/*public*/ interface C2 {

}

interface C3 {

}

// ok
public interface C {

}


// C.java:5: error: interface C2 is public, should be declared in a file named C2.java
// public interface C2 {
//        ^
// 1 error
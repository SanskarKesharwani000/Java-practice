// Functional Interface

@FunctionalInterface
interface C {
    void pro();
    void info();
}


// C.java:3: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   C is not a functional interface
//     multiple non-overriding abstract methods found in interface C
// 1 error

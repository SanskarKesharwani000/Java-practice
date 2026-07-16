@FunctionalInterface
interface X1 {
    void process();
    void info();
}


// @FunctionalInterface
// ^
//   X1 is not a functional interface
//     multiple non-overriding abstract methods found in interface X1
// 1 error
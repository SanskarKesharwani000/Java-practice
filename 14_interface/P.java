// If an abstract class implements an interface then it should not define it's declared methods.

interface P1 {
    void info();
}

abstract class P implements P1 {
    
}

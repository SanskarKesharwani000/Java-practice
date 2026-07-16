// Constructor can be called inside the method.

class N {
    N() {

    }
    
    void pro() {
        new N();
    }
}
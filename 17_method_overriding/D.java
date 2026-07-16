class D1 {
    void pro(int a, float b) {

    }
}

class D extends D1 {
    // parameter body mismatched(sequence): legal method overloading
    void pro(float a, int b) {

    }
}

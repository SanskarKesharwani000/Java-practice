class C1 {
    void pro(int w) {

    }
}

class C extends C1 {
    // parameter body mismatched(type): legal method overloading
    void pro(byte w) {

    }
}

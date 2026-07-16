class B1 {
    void pro() {

    }
}

class B extends B1 {
    // parameter body mismatched(count): legal method overloading
    void pro(int x) {

    }
}

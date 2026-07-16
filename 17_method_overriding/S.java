class S1 {
    private void pro() {

    }
}

class S extends S1 {
    // not a method overriding.... parent method not inheritable ... it is just a coincidental method
    int pro() {
        return 2;
    }
}

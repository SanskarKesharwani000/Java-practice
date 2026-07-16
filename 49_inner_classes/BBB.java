class BBB {
    class A {
        BBB a = BBB.this;

        A() {
            a = BBB.this;
        }
    }    
}

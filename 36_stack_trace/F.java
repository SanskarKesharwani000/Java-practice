class F1 {
    F1() {
        int y = 12/0;
    }
}

class F2 extends F1 {

}

class F3 extends F2 {

}

class F extends F3 {
    F() {
        this("om");
    }

    F(String x) {

    }

    public static void main(String[] args) {
        F x = new F();    
    }
}

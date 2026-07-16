// method can be called any method inside the class and can be called directly inside the constructor.

class M {
    void pro() {

    }

    void info() {
        pro();
    }

    M() {
        pro();
    }
}

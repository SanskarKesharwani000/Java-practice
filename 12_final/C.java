// Any method is inheritable and can be overrided in child class 

class C1 {
    void pro() {
        System.out.println("pro() in Parent C1");
    }

    void info() {
        System.out.println("info() in Parent C1");
    }
}

class C extends C1 {
    void pro() {
        System.out.println("pro() in Child class C");
    }

    void info() {
        System.out.println("info() in Child class C");
    }
}

class AA {
    void walk() {
        System.out.println("I can Walk");
    }
}

class BB extends AA {
    void talk() {
        System.out.println("I can Talk");
    }
}

class CC extends BB {
    void laugh() {
        System.out.println("I can Laugh");
    }
}

class G extends CC {
    public static void main(String[] args) {
        G x = new G();

        x.walk();
        x.talk();
        x.laugh();
    }
}

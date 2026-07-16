// Access through inheritance

class M extends M1 {
    public static void main(String[] args) {
        M.pro(); //ok access through class name

        M a = new M();

        a.pro();  // ok access through object of our class.

    }
}

class M1 {
    static void pro() {
        System.out.println("Hiiiiiiiiii!!!!");
    }
}
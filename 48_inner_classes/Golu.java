class Bholu {
    int raju;
}

class EEE extends Bholu {
    int kaju;
}

class Golu {
    public static void main(String[] args) {
        Bholu z = new EEE();

        System.out.println(z.raju);
        System.out.println(z.kaju);
    }
}

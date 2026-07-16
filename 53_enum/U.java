enum CoffeeMugSize {
    SMALL, MEDIUM, LARGE;

    CoffeeMugSize() {
        System.out.println("Hello");
    }
}

class U {
    public static void main(String[] args) {
        System.out.println(CoffeeMugSize.LARGE);
    }
}

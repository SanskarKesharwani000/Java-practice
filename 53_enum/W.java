enum CoffeeMugSize {
    SMALL(200), MEDIUM(350), LARGE(500);

    private int size;

    CoffeeMugSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    } 
}

class W {
    public static void main(String[] args) {
        CoffeeMugSize[] arr = CoffeeMugSize.values();
        
        for(CoffeeMugSize next : arr) {
            System.out.println(next + " ---- size: " + next.getSize());
        }
    }
}
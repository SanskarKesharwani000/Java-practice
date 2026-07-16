enum CoffeeMugSize {
    SMALL, MEDIUM, LARGE
}

class Y {
    public static void main(String[] args) {
        System.out.println(CoffeeMugSize.SMALL instanceof Object);        
        System.out.println(CoffeeMugSize.SMALL instanceof Enum);        
    }    
}

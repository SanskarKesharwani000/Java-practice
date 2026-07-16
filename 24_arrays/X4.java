class X4 {
    public static void main(String[] args) {
        LivingBeing r = new Cow();
        
        Animal[] x = {
            new Cat(),
            new Dog(),
            new Cow(),
            new Animal(),
            new BDog(),
            (Cow)r
        };

        for(int i=0;i<x.length;i++)
            System.out.println(x[i]);
    }    
}

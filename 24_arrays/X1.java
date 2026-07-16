class X1 {
    public static void main(String[] args) {
        Animal[] x = new Animal[4];

        for(int i=0;i<x.length;i++)
            System.out.println(x[i]);

        x[0] = new Cat();
        x[1] = new Cow();
        x[2] = new Dog();
        x[3] = new BDog();

        System.out.println("----------------------");

        for(int i=0;i<x.length;i++)
            System.out.println(x[i]);
    }    
}

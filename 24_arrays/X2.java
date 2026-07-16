class X2 {
    public static void main(String[] args) {
        Animal[] x = new Animal[5];

        for(int i=0;i<x.length;i++)
            System.out.println(x[i]);

        x[0] = new Cat();
        x[1] = new Cow();
        x[2] = new Dog();
        x[3] = new BDog();
        LivingBeing t = new Cat();
        x[4] = t;

        System.out.println("----------------------");

        for(int i=0;i<x.length;i++)
            System.out.println(x[i]);
    }    
}


// X2.java:13: error: incompatible types: LivingBeing cannot be converted to Animal
//         x[4] = t;
//                ^
// 1 error
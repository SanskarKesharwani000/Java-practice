class X {
    public static void main(String[] args) {
        Animal[] x = new Animal[3];

        for(int i=0;i<x.length;i++)
            System.out.println(x[i]);

        x[0] = new Animal();
        x[1] = new Animal();
        x[2] = new Animal();

        System.out.println("----------------------");

        for(int i=0;i<x.length;i++)
            System.out.println(x[i]);
    }    
}

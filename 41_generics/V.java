import java.util.ArrayList;

class V {
    public static void main(String[] args) {
        ArrayList<? extends Animal> t1 = new ArrayList<Animal>();
        ArrayList<? extends Animal> t2 = new ArrayList<Cat>();
        ArrayList<? extends Animal> t3 = new ArrayList<Cow>();
        ArrayList<? extends Animal> t4 = new ArrayList<Dog>();
        ArrayList<? extends Animal> t5 = new ArrayList<BDog>();
        ArrayList<? extends Animal> t6 = new ArrayList<GDog>();
    }    
}

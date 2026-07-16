import java.util.ArrayList;

class W {
    public static void main(String[] args) {
        ArrayList<? super Dog> x1 = new ArrayList<Dog>();
        ArrayList<? super Dog> x2 = new ArrayList<Animal>();
        ArrayList<? super Dog> x3 = new ArrayList<LivingBeing>();
    }    
}

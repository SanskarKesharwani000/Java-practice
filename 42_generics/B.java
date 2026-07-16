import java.util.ArrayList;

class B {
    public static void main(String[] args) {
        // ArrayList<? implements A1> x1 = new ArrayList<AA>();  // not ok
         
        ArrayList<? extends A1> x1 = new ArrayList<AA>(); 
        ArrayList<? extends A1> x2 = new ArrayList<BB>(); 
        ArrayList<? extends A1> x3 = new ArrayList<CC>(); 
        ArrayList<? extends A1> x4 = new ArrayList<A1>(); 
    }    
}

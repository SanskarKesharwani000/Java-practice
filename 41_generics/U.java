import java.util.ArrayList;

class U {
    public static void main(String[] args) {
        ArrayList<? extends Number> a1 = new ArrayList<Byte>(); 
        ArrayList<? extends Number> a2 = new ArrayList<Short>(); 
        ArrayList<? extends Number> a3 = new ArrayList<Integer>(); 
        ArrayList<? extends Number> a4 = new ArrayList<Long>(); 
        ArrayList<? extends Number> a5 = new ArrayList<Float>(); 
        ArrayList<? extends Number> a6 = new ArrayList<Double>(); 
    }    
}

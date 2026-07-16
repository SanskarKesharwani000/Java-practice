import java.lang.reflect.Constructor;

class M {
    public static void main(String[] args) {
        Class<MM> k = MM.class;
        
        // Constructor[] arr = k.getConstructors();
        Constructor[] arr = k.getDeclaredConstructors();

        for(Constructor next : arr) {
            System.out.println(next);
        }
    }    
}

class MM {
    public MM() {

    }
    
    private MM(int y) {

    }
    
    protected MM(float w) {

    }
    
    MM(boolean q) {

    }
}

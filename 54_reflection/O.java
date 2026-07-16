import java.io.Serializable;
import java.util.RandomAccess;

class O {
    public static void main(String[] args) {
        Class<OO> k = OO.class;

        Class[] arr = k.getInterfaces();
    
        for(Class klass : arr) {
            System.out.println(klass);
        }
    }
}

class OO implements Serializable, RandomAccess {

}

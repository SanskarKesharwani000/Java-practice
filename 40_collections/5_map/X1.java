import java.util.Hashtable;

class X1 {
    public static void main(String[] args) {
        Hashtable<String,Integer> map = new Hashtable<String,Integer>();

        map.put("Golu", null);
    }
}

// Exception in thread "main" java.lang.NullPointerException
//         at java.base/java.util.Hashtable.put(Hashtable.java:476)
//         at X1.main(X1.java:7)
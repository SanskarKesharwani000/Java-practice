import java.util.Hashtable;

class X {
    public static void main(String[] args) {
        Hashtable<String,Integer> map = new Hashtable<String,Integer>();

        map.put(null, 12);
    }
}


// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
//         at java.base/java.util.Hashtable.put(Hashtable.java:481)
//         at X.main(X.java:7)
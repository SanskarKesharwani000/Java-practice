import java.util.TreeMap;

class Z {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<String,Integer>();

        map.put("Golu", null);
        // map.put(null, 23);
    }
}


// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Comparable.compareTo(Object)" because "k1" is null
//         at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
//         at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
//         at java.base/java.util.TreeMap.put(TreeMap.java:785)
//         at java.base/java.util.TreeMap.put(TreeMap.java:534)
//         at Z.main(Z.java:8)

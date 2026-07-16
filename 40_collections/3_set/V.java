import java.util.TreeSet;

class V {
    public static void main(String[] args) {
        TreeSet<Student2> set = new TreeSet<Student2>();

        set.add(new Student2("indresh", 23));
        set.add(new Student2("ganesh", 18));
        set.add(new Student2("manoj", 7));
        set.add(new Student2("gyanesh", 17));
        set.add(new Student2("jeetendra", 12));
        set.add(new Student2("dinesh", 5));
        
        System.out.println(set);
    }
}

// Exception in thread "main" java.lang.ClassCastException: class Student2 cannot be cast to class java.lang.Comparable (Student2 is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
//         at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
//         at java.base/java.util.TreeMap.put(TreeMap.java:785)
//         at java.base/java.util.TreeMap.put(TreeMap.java:534)
//         at java.base/java.util.TreeSet.add(TreeSet.java:255)
//         at V.main(V.java:7)
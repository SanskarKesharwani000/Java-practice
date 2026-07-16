import java.util.TreeSet;

class U {
    public static void main(String[] args) {
        TreeSet<Student1> set = new TreeSet<Student1>();

        set.add(new Student1("indresh", 23));
        set.add(new Student1("ganesh", 18));
        set.add(new Student1("manoj", 7));
        set.add(new Student1("gyanesh", 17));
        set.add(new Student1("jeetendra", 12));
        set.add(new Student1("dinesh", 5));
        
        System.out.println(set);
    }
}

// Exception in thread "main" java.lang.ClassCastException: class Student1 cannot be cast to class java.lang.Comparable (Student1 is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
//         at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
//         at java.base/java.util.TreeMap.put(TreeMap.java:785)
//         at java.base/java.util.TreeMap.put(TreeMap.java:534)
//         at java.base/java.util.TreeSet.add(TreeSet.java:255)
//         at U.main(U.java:7)
// also check K.java

import java.util.HashSet;

class N {
    public static void main(String[] args) {
        HashSet<Student2> x = new HashSet<Student2>();

        x.add(new Student2("bheem", 9));
        x.add(new Student2("raju", 2));
        x.add(new Student2("kaliya", 2));
        x.add(new Student2("jaggu", 5));
        x.add(new Student2("raju", 2));
        x.add(new Student2("chutki", 7));

        System.out.println(x);
    } 
}
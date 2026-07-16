// also check L.java

import java.util.HashSet;

class O {
    public static void main(String[] args) {
        HashSet<Student2> x = new HashSet<Student2>();

        x.add(new Student2("bheem", 9));
        x.add(new Student2("raju", 2));
        x.add(new Student2("kaliya", 2));
        x.add(new Student2("jaggu", 5));
        x.add(new Student2("chutki", 7));

        Student2 t = new Student2("kaliya", 2);
        System.out.println(x.remove(t));
    } 
}
// also check I.java

import java.util.HashSet;

class L {
    public static void main(String[] args) {
        HashSet<Student1> x = new HashSet<Student1>();

        x.add(new Student1("bheem", 9));
        x.add(new Student1("raju", 2));
        x.add(new Student1("kaliya", 2));
        x.add(new Student1("jaggu", 5));
        x.add(new Student1("chutki", 7));

        Student1 t = new Student1("kaliya", 2);
        System.out.println(x.remove(t));
    } 
}
import java.util.HashSet;

class I {
    public static void main(String[] args) {
        HashSet<Student> x = new HashSet<Student>();

        x.add(new Student("bheem", 9));
        x.add(new Student("raju", 2));
        x.add(new Student("kaliya", 2));
        x.add(new Student("jaggu", 5));
        x.add(new Student("chutki", 7));
        
        Student t = new Student("raju", 2);
        
        System.out.println(x.remove(t));
    } 
}
import java.util.TreeMap;

class D {
    public static void main(String[] args) {
        TreeMap<Student,Integer> map = new TreeMap<Student,Integer>();

        map.put(new Student("bheem", 32), 68);
        map.put(new Student("yudhishthir", 35), 89);
        map.put(new Student("nakul", 30), 78);
        map.put(new Student("arjun", 31), 99);
        map.put(new Student("sahdev", 29), 75);
        map.put(new Student("karn", 37), 100);

        System.out.println(map);
    }
}

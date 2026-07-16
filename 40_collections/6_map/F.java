import java.util.TreeMap;

class F {
    public static void main(String[] args) {
        TreeMap<Student2,Integer> map = new TreeMap<Student2,Integer>();

        map.put(new Student2("bheem", 32), 68);
        map.put(new Student2("yudhishthir", 35), 89);
        map.put(new Student2("nakul", 30), 78);
        map.put(new Student2("arjun", 31), 99);
        map.put(new Student2("sahdev", 29), 75);
        map.put(new Student2("karn", 37), 100);

        System.out.println(map);
    }
}

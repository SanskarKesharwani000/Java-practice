import java.util.TreeMap;
import java.util.Comparator;
import java.util.Scanner;


class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Press 1 for NameAscSort\n2 for NameDscSort\n3 for AgeAscSort\n4 for AgeDscSort: ");
        int input = sc.nextInt();

        sc.close();

        Comparator comp = null;

        switch(input) {
            case 1:
                comp = new NameAscSort();
                break;
            case 2:
                comp = new NameDscSort();
                break;
            case 3:
                comp = new AgeAscSort();
                break;
            case 4:
                comp = new AgeDscSort();
                break;
            default:
                System.out.println("Invalid Input... !!!");
                System.exit(0);
        }

        TreeMap<Student,Integer> map = new TreeMap<Student,Integer>(comp);

        map.put(new Student("bheem", 32), 68);
        map.put(new Student("yudhishthir", 35), 89);
        map.put(new Student("nakul", 30), 78);
        map.put(new Student("arjun", 31), 99);
        map.put(new Student("sahdev", 29), 75);
        map.put(new Student("karn", 37), 100);

        System.out.println(map);
    }    
}

class NameAscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student a = (Student)o1;
        Student b = (Student)o2;

        String nm1 = a.name;
        String nm2 = b.name;

        return nm1.compareTo(nm2);
    }
}

class AgeAscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student a = (Student)o1;
        Student b = (Student)o2;

        Integer ag1 = a.age;
        Integer ag2 = b.age;

        return ag1.compareTo(ag2);
    }
}

class AgeDscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student a = (Student)o1;
        Student b = (Student)o2;

        Integer ag1 = a.age;
        Integer ag2 = b.age;

        return ag2.compareTo(ag1);
    }
}

class NameDscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student a = (Student)o1;
        Student b = (Student)o2;

        String nm1 = a.name;
        String nm2 = b.name;

        return nm2.compareTo(nm1);
    }
}

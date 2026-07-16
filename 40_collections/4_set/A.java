import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class A {
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
                System.out.println("Invalid Input...!!");
                System.exit(0);
        }

        TreeSet set = new TreeSet(comp);

        set.add(new Student("yamraj", 1000));
        set.add(new Student("dharamraj", 10000));
        set.add(new Student("indra", 30));
        set.add(new Student("narad", 100));
        set.add(new Student("nandi", 150));

        System.out.println(set);
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
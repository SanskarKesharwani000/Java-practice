import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Press 1 for NameAscSort\n2 for NameDscSort\n3 for AgeAscSort\n4 for AgeDscSort: ");
        int input = sc.nextInt();
        sc.close();

        Comparator<Student> comp = null;

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

        TreeSet<Student> set = new TreeSet<Student>(comp);

        set.add(new Student("yamraj", 1000));
        set.add(new Student("dharamraj", 10000));
        set.add(new Student("indra", 30));
        set.add(new Student("narad", 100));
        set.add(new Student("nandi", 150));

        System.out.println(set);
    }
}

class NameAscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class AgeAscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.age.compareTo(o2.age);
    }
}

class AgeDscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o2.age.compareTo(o1.age);
    }
}

class NameDscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o2.name.compareTo(o1.name);
    }
}
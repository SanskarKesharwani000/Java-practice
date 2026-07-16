import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        sc.close();

        Comparator<Student> comp = null; 

        if(input == 1) 
            comp = new NameAscSort();
        else if(input == 2) 
            comp = new NameDscSort();
        else if(input == 3) 
            comp = new AgeAscSort();
        else if(input == 4) 
            comp = new AgeDscSort();
        else
            System.exit(0);

        PriorityQueue<Student> queue = new PriorityQueue<Student>(comp);

        queue.offer(new Student("karan", 12));
        queue.offer(new Student("naman", 9));
        queue.offer(new Student("safal", 16));
        queue.offer(new Student("vinay", 10));
        queue.offer(new Student("sajal", 5));

        System.out.print(queue.poll()+" ");
        System.out.print(queue.poll()+" ");
        System.out.print(queue.poll()+" ");
        System.out.print(queue.poll()+" ");
        System.out.print(queue.poll()+" ");
    }
}

class NameAscSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class AgeAscSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age.compareTo(s2.age);
    }
}

class NameDscSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.name.compareTo(s1.name);
    }
}

class AgeDscSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.age.compareTo(s1.age);
    }
}

import java.util.Scanner;

class G1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter your college: ");
        String college = sc.nextLine();

        Student1 x = new Student1(name, age, college);

        System.out.println();
        System.out.println(x.name);
        System.out.println(x.age);
        System.out.println(x.college);
    }    
}

import java.util.Scanner;

class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Marks: ");
        float marks = sc.nextFloat();

        // System.out.println("My name is: name and My age is: age and My marks: marks");
        System.out.println("My name is: " + name + " and My age is: " + age + " and My marks: " + marks);


        sc.close();
    }    
}

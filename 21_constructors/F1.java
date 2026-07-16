import java.util.Scanner;

class F1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student x = new Student();

        System.out.println(x.name);
        System.out.println(x.age);

        System.out.print("Enter your name: ");
        x.name = sc.nextLine();

        System.out.print("Enter your age: ");
        x.age = sc.nextInt();        
        
        System.out.println(x.name);
        System.out.println(x.age);
        
        sc.close();
    }    
}

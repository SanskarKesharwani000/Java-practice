import java.util.regex.*;
import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your phone: ");
        String phone = sc.nextLine();
        
        // Pattern p = Pattern.compile("[6-9]\\d\\d\\d\\d\\d\\d\\d\\d\\d");
        Pattern p = Pattern.compile("[6-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");

        Matcher m = p.matcher(phone);

        if(m.matches()) {
            System.out.println(m.group() + " - " + m.start() + " - " + m.end());
        } else {
            System.out.println("Invalid Phone Number");
        }
    }
}
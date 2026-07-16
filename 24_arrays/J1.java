import java.util.Scanner;

class J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] x = new int[4];

        for(int i = 0; i < x.length; i++)
            System.out.println("~" + x[i]);
        
        System.out.println("++++++++++++++++++++++++");


        for(int i = 0; i < x.length; i++) {
            System.out.print("Enter a value for index " + i + ": ");
            x[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("++++++++++++++++++++++++");

        for(int i = 0; i < x.length; i++)
            System.out.println("- "+x[i]);
    }    
}

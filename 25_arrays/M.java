import java.util.Scanner;

class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] y = new String[3][2];

        for(int i=0;i<y.length;i++) {
            for(int j=0;j<y[i].length;j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.print("\t");
        }
        
        System.out.println("\n##########################");
        
        for(int i=0;i<y.length;i++) {
            for(int j=0;j<y[i].length;j++) {
                y[i][j] = sc.nextLine();
                // sc.nextLine();    
            }
        }        

        System.out.println("##########################");

        for(int i=0;i<y.length;i++) {
            for(int j=0;j<y[i].length;j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.print("\t");
        }
    }    
}

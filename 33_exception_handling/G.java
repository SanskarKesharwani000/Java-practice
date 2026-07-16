class G {
    public static void main(String[] args) {
        System.out.println("----- start");

        try {
            int x = Integer.parseInt("1a");
        } catch(NumberFormatException e) {
            System.out.println("Problem...");
        }

        System.out.println("----- end");
    }    
}
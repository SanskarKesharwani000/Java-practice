import java.util.Arrays;

class H {
    public static void main(String[] args) {
        String[] x = {"jay","tinku","vijay","abhay","deepak","kamal"};

        for(String next : x)
            System.out.print(next + " ");

        Arrays.sort(x);
        System.out.println();
        
        for(String next : x)
            System.out.print(next + " ");
        
        System.out.println();

        // System.out.println(Arrays.binarySearch(x, "deepak"));
        System.out.println(Arrays.binarySearch(x, "yamraj"));
    }    
}

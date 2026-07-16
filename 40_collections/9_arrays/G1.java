import java.util.Arrays;

class G1 {
    public static void main(String[] args) {
        int[] x = {45, 23, 67, 12, 53, 34, 9};

        for(int next : x)
            System.out.print(next + " ");
        
        Arrays.sort(x);
        System.out.println("\n");

        for(int next : x)
            System.out.print(next + " ");

        System.out.println("\n");

        // System.out.println(Arrays.binarySearch(x, 53));
        // System.out.println(Arrays.binarySearch(x, 23));
        // System.out.println(Arrays.binarySearch(x, 9));
        System.out.println(Arrays.binarySearch(x, 37));
    }
}

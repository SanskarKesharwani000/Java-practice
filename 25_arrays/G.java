// Enhance for loop can be used for array

class G {
    public static void main(String[] args) {
        int[] x = {340, 560, 780, 120, 809};

        // for(int i=0;i<x.length;i++)
        //     System.out.println(x[i]);
        
        for(int next : x)
            System.out.println(next);
    }    
}

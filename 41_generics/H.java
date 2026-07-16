import java.util.ArrayList;

class H {
    public static void main(String[] args) {
         // only reference type is expected

        ArrayList<int> x = new ArrayList<int>(); 
        ArrayList<char> x = new ArrayList<char>(); 

        ArrayList<12> x = new ArrayList<12>(); 
        ArrayList<"om"> x = new ArrayList<"om">();   
    }    
}


// H.java:5: error: unexpected type
//         ArrayList<int> x = new ArrayList<int>();
//                   ^
//   required: reference
//   found:    int
// H.java:5: error: unexpected type
//         ArrayList<int> x = new ArrayList<int>();
//                                          ^
//   required: reference
//   found:    int
// 2 errors

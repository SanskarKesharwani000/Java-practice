import java.util.regex.Pattern;

class B {
    public static void main(String[] args) {
        Pattern x = new Pattern();
    }    
}


// B.java:5: error: constructor Pattern in class Pattern cannot be applied to given types;
//         Pattern x = new Pattern();
//                     ^
//   required: String,int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error

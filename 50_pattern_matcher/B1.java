import java.util.regex.Pattern;

class B1 {
    public static void main(String[] args) {
        Pattern x = new Pattern("monu", 2);
    }    
}


// B1.java:5: error: Pattern(String,int) has private access in Pattern
//         Pattern x = new Pattern("monu", 2);
//                     ^
// 1 error
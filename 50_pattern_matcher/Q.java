import java.util.regex.*;

class Q {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\d");

        Matcher m = p.matcher("my age 23 and my score 754 my rank is 9");

        while(m.find()) {
            System.out.println(m.group() + " - " + m.start() + " - " + m.end());
        }
    }
}


// Q.java:5: error: illegal escape character
//         Pattern p = Pattern.compile("\d");
//                                       ^
// 1 error
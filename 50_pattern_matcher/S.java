import java.util.regex.*;

class S {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\s");

        Matcher m = p.matcher("--- ------\n--------\t----\f-----\r--");

        while(m.find()) {
            // System.out.println(m.group() + " - " + m.start() + " - " + m.end());
            System.out.println((int)(m.group().charAt(0)) + " - " + m.start() + " - " + m.end());
        }
    }
}



// System.out.println((int)'A');
// System.out.println((int)'a');
// System.out.println((int)'\b');
// System.out.println((int)'\t');
// System.out.println((int)'\n');
// System.out.println((int)'\f');
// System.out.println((int)'\r');
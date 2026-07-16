import java.util.regex.*;

class Y {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-dj-s]");

        Matcher m = p.matcher("---n---d----i----l-----y----q----e---b--");

        while(m.find()) {
            System.out.println(m.group() + " - " + m.start() + " - " + m.end());
        }
    }
}
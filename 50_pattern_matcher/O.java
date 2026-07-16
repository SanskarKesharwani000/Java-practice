import java.util.regex.*;

class O {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("aba");

        Matcher m = p.matcher("abaadaabaaa");

        while(m.find()) {
            System.out.println(m.group() + " - " + m.start() + " - " + m.end());
        }
    }
}

import java.util.regex.*;

class P {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a.a");

        Matcher m = p.matcher("--aba----  ----a#a----a3a-----aTaanma");

        while(m.find()) {
            System.out.println(m.group() + " - " + m.start() + " - " + m.end());
        }
    }
}

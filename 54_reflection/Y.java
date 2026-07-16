import java.lang.reflect.Field;

class YY {
    int abc;

    YY(int abc) {
        this.abc = abc;
    }
}

class Y {
    public static void main(String[] args) {
        YY a1 = new YY(34);
        YY a2 = new YY(56);
        YY a3 = new YY(78);
        
        // System.out.println(a1.abc);
        // System.out.println(a2.abc);
        // System.out.println(a3.abc);

        Field f = YY.class.getDeclaredFields()[0];

        try {
            System.out.println(f.get(a3));
            System.out.println(f.get(a1));
            System.out.println(f.get(a2));
        } catch(IllegalAccessException e) {
            e.printStackTrace();
        }
    }     
}

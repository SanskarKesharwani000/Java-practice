enum Daz {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class L {
    Daz q;

    public static void main(String[] args) {
        System.out.println(q);
    }
}

// L.java:9: error: non-static variable q cannot be referenced from a static context
//         System.out.println(q);
//                            ^
// 1 error

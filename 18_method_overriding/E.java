class E1 {
    protected static void pro() {

    }
}


class E extends E1 {
    // protected static void pro() {
    // static void pro() {   // attempting to assign weaker access privileges; was protected
    public static void pro() {

    }
}

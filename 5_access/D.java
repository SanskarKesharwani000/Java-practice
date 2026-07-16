// we can access another class instance variable through instantiation

class D {
    public static void main(String[] args) {
        D1 a = new D1();
 
        System.out.println(a.y);  // Access Through Instantiation
    }
}


class D1 {
    int y = 89;
}

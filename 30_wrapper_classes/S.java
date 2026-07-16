class S {
    public static void main(String[] args) {
        Character a = new Character('A');
        Character b = Character.valueOf('A');
        Character c = 'A';

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }    
}

class C {
    public static void main(String[] args) throws ClassNotFoundException {
        Class k = Class.forName("CC");    

        System.out.println(k);
    }    
}

class CC {

}

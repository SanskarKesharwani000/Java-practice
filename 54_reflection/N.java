class N {
    public static void main(String[] args) {
        Class<NN> k = NN.class;
        
        Class x = k.getSuperclass(); 

        System.out.println(k);
        System.out.println(x);
    }
}

class NN1 {

}

class NN extends NN1 {

}

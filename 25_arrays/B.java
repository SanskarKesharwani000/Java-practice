class B {
    public static void main(String[] args) {
        int[] x = new int[-1]; // NegativeArraySizeException

        System.out.println(x[-1]);  // ArrayIndexOutOfBoundsException
    }    
}

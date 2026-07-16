class Z {
    private static int e = 999;

    static class AA {
        private void process() {
            System.out.println(e);
        }
    }   
    
    public static void main(String[] args) {        
        AA a = new AA();
        a.process();
    }
}

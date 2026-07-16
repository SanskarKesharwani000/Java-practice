class O {
    public static void main(String[] args) {
        ThreadGroup sysTg = Thread.currentThread().getThreadGroup().getParent();

        System.out.println(sysTg.activeCount());
        System.out.println("+++++++++++++++++++++++++++++");
        sysTg.list();
    }    
}

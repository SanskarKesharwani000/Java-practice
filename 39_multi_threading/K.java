class K {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        System.out.println("Default Thread's Name: " + x.getName());

        ThreadGroup tg = x.getThreadGroup();

        System.out.println("Default Thread Group: " + tg.getName());

        System.out.println("Active Thread Count: " + tg.activeCount());
    }    
}

class F {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        ThreadGroup tg = t.getThreadGroup();

        System.out.println(tg.getName());

        ThreadGroup tgPt = tg.getParent();

        System.out.println(tgPt.getName());

        ThreadGroup tgGpt = tgPt.getParent();

        System.out.println(tgGpt);
    }    
}
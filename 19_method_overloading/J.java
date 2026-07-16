class J {
    static void prepareBathua(Bathua x) {
        System.out.println("----- step 1");
        System.out.println("----- step 3");
        System.out.println("----- step 7");
        System.out.println("----- step 9");
    }

    static void prepareCholai(Cholai x) {
        System.out.println("----- step 2");
        System.out.println("----- step 4");
        System.out.println("----- step 5");
        System.out.println("----- step 7");
    }

    static void prepareNorpa(Norpa x) {
        System.out.println("----- step 1");
        System.out.println("----- step 3");
        System.out.println("----- step 5");
        System.out.println("----- step 9");
    }

    public static void main(String[] args) {
        Bathua bathua = new Bathua();
        Cholai cholai = new Cholai();
        Norpa norpa = new Norpa();
        
        prepareBathua(bathua);
        prepareCholai(cholai);
        prepareNorpa(norpa);
    }    
}

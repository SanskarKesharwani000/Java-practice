class K1 {
    // static void prepareBathua(Bathua x) {
    static void prepareLeafyVegetable(Bathua x) {
        System.out.println("----- step 1");
        System.out.println("----- step 3");
        System.out.println("----- step 7");
        System.out.println("----- step 9");
    }

    // static void prepareCholai(Cholai x) {
    static void prepareLeafyVegetable(Cholai x) {
        System.out.println("----- step 2");
        System.out.println("----- step 4");
        System.out.println("----- step 5");
        System.out.println("----- step 7");
    }

    // static void prepareNorpa(Norpa x) {
    static void prepareLeafyVegetable(Norpa x) {
        System.out.println("----- step 1");
        System.out.println("----- step 3");
        System.out.println("----- step 5");
        System.out.println("----- step 9");
    }

    public static void main(String[] args) {
        Bathua bathua = new Bathua();
        Cholai cholai = new Cholai();
        Norpa norpa = new Norpa();
        LalBhaji lalBhaji = new LalBhaji();
        
        // Compile-time Polymorphism
        prepareLeafyVegetable(bathua);
        prepareLeafyVegetable(cholai);
        prepareLeafyVegetable(norpa);
        prepareLeafyVegetable(lalBhaji);
    }    
}


// K.java:36: error: no suitable method found for prepareLeafyVegetable(LalBhaji)
//         prepareLeafyVegetable(lalBhaji);
//         ^
//     method K.prepareLeafyVegetable(Bathua) is not applicable
//       (argument mismatch; LalBhaji cannot be converted to Bathua)
//     method K.prepareLeafyVegetable(Cholai) is not applicable
//       (argument mismatch; LalBhaji cannot be converted to Cholai)
//     method K.prepareLeafyVegetable(Norpa) is not applicable
//       (argument mismatch; LalBhaji cannot be converted to Norpa)
// 1 error
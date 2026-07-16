enum CoffeeMugSize {
    SMALL, MEDIUM, LARGE;

    CoffeeMugSize(String label) {
        System.out.println("Hello");
    }
}

class V {
    public static void main(String[] args) {
        System.out.println(CoffeeMugSize.LARGE);
    }
}



// V.java:2: error: constructor CoffeeMugSize in enum CoffeeMugSize cannot be applied to given types;
//     SMALL, MEDIUM, LARGE;
//     ^
//   required: String
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// V.java:2: error: constructor CoffeeMugSize in enum CoffeeMugSize cannot be applied to given types;
//     SMALL, MEDIUM, LARGE;
//            ^
//   required: String
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// V.java:2: error: constructor CoffeeMugSize in enum CoffeeMugSize cannot be applied to given types;
//     SMALL, MEDIUM, LARGE;
//                    ^
//   required: String
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 3 errors


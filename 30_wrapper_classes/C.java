class C {
    public static void main(String[] args) {
        Float x = 23;

        Double y = 2.3f;

        Long z = 12;
    }    
}



// C.java:3: error: incompatible types: int cannot be converted to Float
//         Float x = 23;
//                   ^
// C.java:5: error: incompatible types: float cannot be converted to Double
//         Double y = 2.3f;
//                    ^
// C.java:7: error: incompatible types: int cannot be converted to Long
//         Long z = 12;
//                  ^
// 3 errors
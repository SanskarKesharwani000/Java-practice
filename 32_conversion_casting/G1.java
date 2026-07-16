class G1 {
    public static void main(String[] args) {

        Animal x = new LivingBeing();
        // Incompatible Types...

        System.out.println(x);
    }    
}


// G1.java:4: error: incompatible types: LivingBeing cannot be converted to Animal
//         Animal x = new LivingBeing();
//                    ^
// 1 error
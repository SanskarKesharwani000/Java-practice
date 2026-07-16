class G3 {
    public static void main(String[] args) {
        LivingBeing y = new Cat();

        // Narrowing Conversion: Type-Casting is Required... and is Convertible
        Animal x = y;

        System.out.println(x);
    }    
}


// G3.java:4: error: incompatible types: LivingBeing cannot be converted to Animal
//         Animal x = y;
//                    ^
// 1 error
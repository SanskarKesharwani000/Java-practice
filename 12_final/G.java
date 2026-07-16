// We can create variable of a final class through instantiation but not through inheritance

final class G1 {

}

class G {
    public static void main(String[] args) {
        G1 x;
    }
}

// not ok
// class G extends G1 {
    
// }

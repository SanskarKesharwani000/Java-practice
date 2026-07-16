class G1 {
    int y = 90;
}

class G extends G1 {
    @Override
    int y = 23;
}


// F.java:2: error: annotation type not applicable to this kind of declaration
//     @Override
//     ^
// 1 error
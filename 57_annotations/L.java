@interface LL {
    int a = 23;
    float b = 3.4f;
}

@LL(a=90, b=123.45f)
class L {
    
}



// L.java:6: error: cannot find symbol
// @LL(a=90, b=123.45f)
//     ^
//   symbol:   method a()
//   location: @interface LL
// L.java:6: error: cannot find symbol
// @LL(a=90, b=123.45f)
//           ^
//   symbol:   method b()
//   location: @interface LL
// 2 errors
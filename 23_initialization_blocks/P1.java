
// We can use variable inside instance initialization block if it is created before it.
class P1 {
    
    {
        System.out.println(y);
    }

    int y = 89;
}


// P1.java:4: error: illegal forward reference
//         System.out.println(y);
//                            ^
// 1 error
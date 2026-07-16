enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class P {   
    
    public static void main(String[] args) {
        Days q = Days.FATHERSDAY;
 
        System.out.println(q);
    }    
}


// P.java:8: error: cannot find symbol
//         Days q = Days.FATHERSDAY;
//                      ^
//   symbol:   variable FATHERSDAY
//   location: class Days
// 1 error
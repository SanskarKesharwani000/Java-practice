enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class Q {   
    
    public static void main(String[] args) {
        Days[] arr = Days.values();
 
        for(Days next : arr)
            System.out.println(next);
    }    
}
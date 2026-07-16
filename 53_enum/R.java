enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class R {   
    
    public static void main(String[] args) {
        Days[] arr = Days.values();
 
        for(Days next : arr)
            System.out.println(next.name() + " --- " + next.ordinal());
    }    
}
// Using two inbuilt classes of same name in different package.

import java.util.Date;
// import java.sql.Date;

class J {
    public static void main(String[] args) {
        Date x;  // java.util.Date
        java.sql.Date y;
    }
} 

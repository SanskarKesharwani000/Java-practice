// first extends comes then implements comes

class Human {

}

interface Intelligent {

}

interface Smart {

}



class American implements Smart, Intelligent extends Human {

}


// U.java:15: error: '{' expected
// class American implements Smart, Intelligent extends Human {
//                                             ^
// 1 error
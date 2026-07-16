class T {
    public static void main(String[] args) {
        try {
            System.out.println("some code... " + args[0]);
        } catch(ArrayIndexOutOfBoundsException w) {
            // System.out.println(w);
            // converting an exception from one type to another...
            throw new MissingCommandlineArgumentException("one argument expected...");
        }
    }   
}

class MissingCommandlineArgumentException extends RuntimeException {
    MissingCommandlineArgumentException() {

    }
    
    MissingCommandlineArgumentException(String msg) {
        super(msg);
    }
}

enum CoffeeMugSize {
    SMALL(200, "A+"), MEDIUM(350, "B"), LARGE(500, "A+++");

    private int size;
    private String grade;

    CoffeeMugSize(int size, String grade) {
        this.size = size;
        this.grade = grade;
    }

    public int getSize() {
        return size;
    } 

    public String getGrade() {
        return grade;
    }
}

class X {
    public static void main(String[] args) {
        CoffeeMugSize[] arr = CoffeeMugSize.values();
        
        for(CoffeeMugSize next : arr) {
            System.out.println(next + " ---- size: " + next.getSize() + " --- grade: " + next.getGrade());
        }
    }
}
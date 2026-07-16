class College {
    String name;
    
    College(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj instanceof College) {
            College a = this;
            College b = (College)obj;

            String nm1 = a.name;
            String nm2 = b.name;

            flag = nm1.equals(nm2);
        }

        return flag;
    }
}

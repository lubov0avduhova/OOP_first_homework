class Person implements Human {

    private String fullName;

    public String getFullname() {
        return fullName;
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return getFullname();
    }


//    public Person(String name, Human woman, Human man) {
//        super(name);
//        this.woman = woman;
//        this.man = man;
//    }
//
//
//    public Person(String name, Woman woman) {
//        super(name);
//        this.woman = woman;
//    }
//
//    public Person(String name, Man man) {
//        super(name);
//        this.man = man;
//    }
//
//
//
//    public String toString(String firstName, String lastName, char gender, Woman woman, Man man) {
//        return firstName + " " + lastName + " " + gender + " " + woman + " " + man;
//    }


}

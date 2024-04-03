public abstract class Person {
    private String name;
    private String middleName;
    private String lastName;

    public Person(String name, String middleName, String lastName) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    private String fullName(){return name+" "+middleName+" "+lastName;}
    public String toString(){return "Аз съм "+fullName();}
}

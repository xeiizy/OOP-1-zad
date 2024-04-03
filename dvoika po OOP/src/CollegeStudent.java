import java.util.Objects;

public class CollegeStudent extends Person implements Member,Education{


    private String facultyNumber;
    public CollegeStudent(String name, String middleName, String lastName, String facultyNumber) {
        super(name, middleName, lastName);
        this.facultyNumber=facultyNumber;

    }


    @Override
    public double Training(int skills) {
        return (double) (skills*9)/100;
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        return super.toString()+", студент с факултетен номер"+facultyNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollegeStudent that = (CollegeStudent) o;
        return Objects.equals(facultyNumber, that.facultyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facultyNumber);
    }
}
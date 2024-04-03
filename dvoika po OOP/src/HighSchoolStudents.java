import java.util.Objects;

public class HighSchoolStudents extends Person implements Member,Education{

    public HighSchoolStudents(String name, String middleName, String lastName,String schoolName,int studentBookNumber) {
        super(name, middleName, lastName);
        this.schoolName=schoolName;
        this.studentBookNumber=studentBookNumber;
        if (studentBookNumber<1000000||studentBookNumber>9999999){throw new InvalidValueException("HighSchoolStudents","HighSchoolStudents","studentBookNumber");
        }
    }

    @Override
    public double Training(int skills) {
        return (double) (skills * 6) /100;
    }
    private String schoolName;
    private int studentBookNumber;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getStudentBookNumber() {
        return studentBookNumber;
    }

    public void setStudentBookNumber(int studentBookNumber) {
        if (studentBookNumber<1000000||studentBookNumber>9999999){throw new InvalidValueException("HighSchoolStudents","setStudentBookNumber","studentBookNumber");}
        this.studentBookNumber = studentBookNumber;
    }

    @Override
    public String toString() {
        return super.toString()+", учител в"+schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HighSchoolStudents that = (HighSchoolStudents) o;
        return studentBookNumber == that.studentBookNumber && Objects.equals(schoolName, that.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, studentBookNumber);
    }
}

import java.util.Objects;
import java.util.Set;

public class Scientist extends Person implements Mentor,Education {

    private Set<Member> students;
    private String facultyNumber;


    public Scientist(String name, String middleName, String lastName, Set<Member> students) {
        super(name, middleName, lastName);
        this.students = students;
        if (students.size() > 5) {
            throw new InvalidValueException("Scientist", "Scientist", "collegeStudents");
        }

    }

    public Set<Member> getStudents() {
        return students;
    }

    public void setStudents(Set<Member> students) {
        if (students.size() > 5) {
            throw new InvalidValueException("Scientist", "setStudents", "collegeStudents");
        }

        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scientist scientist = (Scientist) o;
        return Objects.equals(students, scientist.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }
    @Override
    public String toString() {
        return super.toString()+", учен в"+facultyNumber;
    }

    @Override
    public double Training(int skills) {
        for (Member collegeStudents : students) {
            collegeStudents.Training(skills);

        }
        return 0;
    }
}




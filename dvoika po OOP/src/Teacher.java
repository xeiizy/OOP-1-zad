import java.util.Objects;
import java.util.Set;

public class Teacher extends Person implements Mentor,Education{

private String schoolName;
private Set<Member>students;
      public Teacher(String name, String middleName, String lastName, String schoolName, Set<Member>students) {
          super( name,middleName,lastName);
          this.schoolName=schoolName;
          this.students=students;
          if (students.size() > 5) {throw new InvalidValueException("Teacher","Teacher","students");
             }
          }

    @Override
    public double Training(int skills) {
    for(Member schoolStudents:students){schoolStudents.Training(skills);

    }
        return 0;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Set<Member> getStudents() {
        return students;
    }

    public void setStudents(Set<Member> students) {
        this.students = students;
    }
    @Override
    public String toString() {
        return super.toString()+", учител в"+schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(schoolName, teacher.schoolName) && Objects.equals(students, teacher.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, students);
    }
}

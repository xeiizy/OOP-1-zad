import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Member> students=new HashSet<>();
        CollegeStudent student1=new CollegeStudent("Asda","ignat","profesor","12");
        HighSchoolStudents students1=new HighSchoolStudents("Alex","Ganehev","Kukata","DDZ",4000000);
        students.add(students1);
        students.add(student1);
        Mentor teacher1=new Teacher("Sasho","Ivanov","Petrov","Varna",students);
        Mentor teacher2=new Teacher("Angel","Popov","Kunchev","Sofiq",students);
        Mentor teacher3=new Teacher("Sasho","Ivanov","Petrov","Gabrovo",students);
        Mentor scientist1=new Scientist("","","",students);

        Map<Mentor,Integer> mentors=new HashMap<>();
        mentors.put(teacher2,50);
        mentors.put(teacher3,49);
        mentors.put(scientist1,20);


Event event=new Event(teacher1,mentors);
event.Training(50);
        System.out.println(event.getMentors());
        event.getMembers();

    }
}
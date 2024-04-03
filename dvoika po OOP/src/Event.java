import java.util.Map;

public class Event{

    private Mentor mentor;
  private Map<Mentor,Integer>mentors;

    public Event(Mentor mentor, Map<Mentor, Integer> mentors) {
        this.mentor = mentor;
        this.mentors = mentors;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public Map<Mentor, Integer> getMentors() {
        return mentors;
    }

    public void setMentors(Map<Mentor, Integer> mentors) {
        this.mentors = mentors;
    }

    public void addMentor(Mentor mentor,int skill){
        if (skill>100||skill<1) {
            throw new InvalidValueException("Event", "addMentor", "skill");
        }
        mentors.put(mentor,skill);


    }
    public void addMember(Member member){
        for (var m: mentors.entrySet()){if(m.getKey().getStudents().size()<5){m.getKey().getStudents().add(member);
         break;
        }

        }
    }
    public void Training(int skill){
        for (var m:mentors.entrySet())
        {m.getKey().Training(skill);}
    }

    public void getMembers(){
        for (var m:mentors.entrySet())
        {
            System.out.println(m.getKey().getStudents());}

    }



}

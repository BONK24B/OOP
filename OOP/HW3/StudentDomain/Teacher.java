package OOP.HW3.StudentDomain;

public class Teacher extends User{

    private String subject;
    private long teacherId;

    public Teacher(String firstName, String secondName, int age, String subject, long teacherId) {
        super(firstName, secondName, age);
        this.subject = subject;
        this.teacherId = teacherId;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }

    public void setTeacherId(long teacherId){
        this.teacherId = teacherId;
    }

    public long getTeacherId(){
        return teacherId;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nSubject: " + subject + "\nTeacher ID: " + teacherId;
    }

}

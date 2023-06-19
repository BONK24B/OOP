package MVCStudentApp.Model;

public class StudentMVC extends UserMVC implements Comparable<StudentMVC>{

    private long studentId;

    public StudentMVC(String firstName, String secondName, int age, long studentId) {
        super(firstName, secondName, age);
        this.studentId = studentId;
    }

    public void setStudentId(long studentId){
        this.studentId = studentId;
    }

    public long getStudentId(){
        return studentId;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStudent ID: " + studentId;
    }

    @Override
    public int compareTo(StudentMVC o) {
        if (this.getAge() == o.getAge()){
            if (this.getStudentId() == o.getStudentId()){
                return 0;
            }
            else if (this.getStudentId() < o.getStudentId()){
                return -1;
            }
            else
                return 1;
        }
        else if (this.getAge() < o.getAge()){
            return -1;
        }
        else
            return 1;
    }
    
}

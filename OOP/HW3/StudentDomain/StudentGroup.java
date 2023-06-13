package OOP.HW3.StudentDomain;

import java.util.Iterator;
import java.util.List;


public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>
{
    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents(){
        return students;
    }

    public void setStudents(List<Student> students){
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }

    @Override
    public int compareTo(StudentGroup o) {
        if (this.students.size() == o.students.size())
            return 0;
        else if (this.students.size() < o.students.size())
            return -1;
        else
            return 1;
    }
}

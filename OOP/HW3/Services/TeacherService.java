package HW3.Services;

import java.util.ArrayList;
import java.util.List;

import HW3.StudentDomain.PersonComparator;
import HW3.StudentDomain.Teacher;

public class TeacherService implements IUserService<Teacher>{
    
    private long count;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }    

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher teacher = new Teacher(firstName, secondName, age, "basic", count);
        count++;
        teachers.add(teacher);
    }

    public List<Teacher> getSortedByName(){
        List<Teacher> newTeacherList = new ArrayList<>(teachers);
        newTeacherList.sort(new PersonComparator<Teacher>());

        return newTeacherList;
    }
    
}

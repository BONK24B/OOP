package OOP.HW3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import OOP.HW3.StudentDomain.Student;
import OOP.HW3.StudentDomain.StudentGroup;
import OOP.HW3.StudentDomain.StudentStream;
import OOP.HW3.StudentDomain.Teacher;
import OOP.HW3.StudentDomain.User;

public class MainApp {
    public static void main(String[] args) {
        Student u1 = new Student("Aleksej", "Petrov", 19, 88);
        User u2 = new User("Jane", "Doe", 43);
        Teacher u3 = new Teacher("John", "Doe", 47, "Chemistry", 14);
        Student student1 = new Student("Bronislav", "Kaminskij", 19, 90);
        Student student2 = new Student("Olgerd", "Flisov", 21, 15);
        Student student3 = new Student("Konrad", "Olsanskij", 18, 14);
        Student student4 = new Student("Georgij", "Sokolov", 25, 140);
        Student student5 = new Student("Valeria", "Markova", 19, 88);
        Student student6 = new Student("Semion", "Semionov", 34, 328);
        Student student7 = new Student("Andrej", "Bileckij", 23, 2501);
        Student student8 = new Student("Valentin", "Sikorskij", 18, 451);


        List<Student> studentList = new ArrayList<>();
        List<Student> studentList2 = new ArrayList<>();
        List<Student> studentList3 = new ArrayList<>();
        List<Student> studentList4 = new ArrayList<>();

        studentList.add(u1);
        studentList.add(student1);
        studentList2.add(student2);
        studentList2.add(student3);
        studentList2.add(student4);
        studentList2.add(student5);
        studentList3.add(student6);
        studentList3.add(student7);
        studentList4.add(student8);

        StudentGroup group = new StudentGroup(studentList);
        StudentGroup group2 = new StudentGroup(studentList2);
        StudentGroup group3 = new StudentGroup(studentList3);
        StudentGroup group4 = new StudentGroup(studentList4);

        List<StudentGroup> stream1 = new ArrayList<>();
        List<StudentGroup> stream2 = new ArrayList<>();

        stream1.add(group);
        stream1.add(group2);
        stream1.add(group3);
        stream2.add(group4);

        StudentStream studStream1 = new StudentStream(4, stream1);
        StudentStream studStream2 = new StudentStream(1, stream2);

        for (StudentGroup groupe : studStream1){
            System.out.println(groupe);
        }

        System.out.println("--------------");

        for (StudentGroup groupe : studStream2){
            System.out.println(groupe);
        }

        System.out.println("-----------Sorted----------");

        Collections.sort(stream1);

        for (StudentGroup groupe : studStream1){
            System.out.println(groupe);
        }

        // for (Student student : group){
        //     System.out.println(student);
        //     System.out.println("--------------");
        // }

        // for (Student student : group2){
        //     System.out.println(student);
        // }
    }
}

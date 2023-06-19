package MVCStudentApp.View;

import java.util.List;
import java.util.Scanner;

import MVCStudentApp.Controller.IGetView;
import MVCStudentApp.Model.StudentMVC;

public class View implements IGetView{
    public void printAllStudents(List<StudentMVC> students){
        System.out.println("----------Student list----------");
        for (StudentMVC stud : students){
            System.out.println(stud);
        }
        System.out.println("----------end of student list----------");
    }

    @Override
    public String prompt(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.nextLine();
    }
}

package MVCStudentApp.View;

import java.util.List;
import java.util.Scanner;

import MVCStudentApp.Controller.IGetView;
import MVCStudentApp.Model.StudentMVC;

public class ViewRU implements IGetView{

    @Override
    public void printAllStudents(List<StudentMVC> students) {
        System.out.println("----------Список студентов----------");
        for (StudentMVC stud : students){
            System.out.println(stud);
        }
        System.out.println("----------Конец списка----------");
    }

    @Override
    public String prompt(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.nextLine();
    }
    
}

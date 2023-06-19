package MVCStudentApp;

import java.util.ArrayList;
import java.util.List;

import MVCStudentApp.Controller.Controller;
import MVCStudentApp.Controller.IGetModel;
import MVCStudentApp.Controller.IGetView;
import MVCStudentApp.Model.FileModel;
import MVCStudentApp.Model.HashModel;
import MVCStudentApp.Model.Model;
import MVCStudentApp.Model.StudentMVC;
import MVCStudentApp.View.View;
import MVCStudentApp.View.ViewRU;

public class App {
    public static void main(String[] args) {
        StudentMVC student = new StudentMVC("Aleksej", "Voronin", 18, 36);
        StudentMVC student2 = new StudentMVC("Dmitrij", "Kustov", 25, 16);
        StudentMVC student3 = new StudentMVC("Sviatoslav", "Doroneckij", 29, 6);
        StudentMVC student4 = new StudentMVC("Edvard", "Grajvoronskij", 18, 88);
        StudentMVC student5 = new StudentMVC("Mstislav", "Udaloj", 23, 14);

        List<StudentMVC> students = new ArrayList<>();

        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        FileModel fModel = new FileModel("StudentsDB.txt");
        // fModel.saveAllStudentsToFile(students);

        // IGetModel newFModel = fModel;
        IGetModel hashModel = new HashModel(students);
        IGetModel model = new Model(students);
        IGetView view = new View();
        Controller controller = new Controller(view, hashModel);

        controller.run();
    }
}

package MVCStudentApp.Controller;

import MVCStudentApp.View.View;

import java.util.ArrayList;
import java.util.List;

import MVCStudentApp.Model.Model;
import MVCStudentApp.Model.StudentMVC;

public class Controller {
    private IGetView view;
    private IGetModel model;
    private List<StudentMVC> students;

    public Controller(IGetView view, IGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<StudentMVC>();
    }

    public boolean testData(){
        if (students.size() > 0)
            return true;
        else
            return false;
    }

    public void getAllStudents(){
        students = model.getAllStudents();
    }

    public void update(){
        //MVP
        getAllStudents();

        if (testData())
            view.printAllStudents(students);
        else
            System.out.println("Empty list");
        //MVC
        // view.printAllStudents(model.getAllStudents());
    }

    public void run(){
        Commands com = Commands.NONE;
        boolean getNewIteration = true;

        while (getNewIteration){
            String command = view.prompt("Enter command: ");
            com = Commands.valueOf(command.toUpperCase());

            switch(com){
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Quitting the program");
                    break;
                case LIST:
                    getAllStudents();
                    view.printAllStudents(students);
                    break;
                case DELETE:
                    getAllStudents();
                    model.deleteById(students);
                    break;
            }
        }
    }
}

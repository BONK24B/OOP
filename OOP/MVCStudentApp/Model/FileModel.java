package MVCStudentApp.Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import MVCStudentApp.Controller.IGetModel;

public class FileModel implements IGetModel{
    private String fileName;

    public FileModel(String fileName){
        this.fileName = fileName;

        try (FileWriter fw = new FileWriter(fileName, true)){
            fw.flush();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<StudentMVC> getAllStudents() {
        List<StudentMVC> students = new ArrayList<>();
        try{
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();

            while (line != null){
                String[] param = line.split(" ");
                StudentMVC pers = new StudentMVC(param[0], param[1], Integer.parseInt(param[2]), Integer.parseInt(param[3]));
                students.add(pers); 
                line = br.readLine();
            }
            br.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return students;
    }

    public void saveAllStudentsToFile(List<StudentMVC> students){
        try (FileWriter fw = new FileWriter(fileName, true)){
            for (StudentMVC pers : students){
                fw.write(pers.getFirstName() + " "
                 + pers.getSecondName() + " " + pers.getAge() + " " + pers.getStudentId());
                fw.append("\n");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteById(List<StudentMVC> students) {
        Scanner scan = new Scanner(System.in);
        long id = scan.nextLong();
        boolean isFound = false;

        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getStudentId() == id){
                students.remove(students.get(i));
                i--;
                isFound = true;
            }
        }
        if (!isFound){
            System.out.println("Student not found");
        }
    }
}

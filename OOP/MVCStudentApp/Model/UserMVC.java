package MVCStudentApp.Model;


public class UserMVC {
    private String firstName;
    private String secondName;
    private int age;

    public UserMVC(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    public String getSecondName(){
        return secondName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + "\nSecond Name: " + secondName + "\nAge: " + age;
    }
}

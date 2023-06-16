package OOP.HW3.StudentDomain;

import java.util.List;

public class AverageAge<T extends User>{
    private List<T> users;

    public AverageAge(List<T> users) {
        this.users = users;
    }

    public double averageAge(){
        double sum = 0;

        for (T user : users){
            sum += user.getAge();
        }

        return sum / users.size();
    }
}

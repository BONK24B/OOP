package HW3.StudentDomain;

import java.util.Iterator;
import java.util.List;

public class StudentStreamIterator implements Iterator<StudentGroup>{

    private int counter;
    private final List<StudentGroup> groups;

    public StudentStreamIterator(List<StudentGroup> groups) {
        this.groups = groups;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < groups.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext())
            return null;

        return groups.get(counter++);
    }
    
}

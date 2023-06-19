package HW3.StudentDomain;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup>{

    private int streamNumber;
    private List<StudentGroup> groups;

    public StudentStream(int streamNumber, List<StudentGroup> groups) {
        this.streamNumber = streamNumber;
        this.groups = groups;
    }

    public int getStreamNumber(){
        return streamNumber;
    }

    public List<StudentGroup> getGroups(){
        return groups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentStreamIterator(groups);
    }
    
}

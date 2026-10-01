import java.util.ArrayList;
public class StudentList {
    private ArrayList<String> names;
    

    public StudentList() {
        names = new ArrayList<>();
    }

    public void addStudent(String name) {
        names.add(name);
    }

    public ArrayList<String> returnNames() {
        return names;
    }

    
}
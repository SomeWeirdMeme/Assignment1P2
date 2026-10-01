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
    
    public void DisplayNames() {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public boolean containsName(String name){
        if(names.contains(name)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean removeName(String name){
        if(names.contains(name)){
            names.remove(name);
            return true;
        } else{
            return false;
        }
    }

    public int getNumberOfNames(){
        return names.size();
    }

    
}
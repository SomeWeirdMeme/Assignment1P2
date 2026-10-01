import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListProblem 
{
    public static void main(String[] args) throws Exception {
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("John");
        studentList.add("Jane"); 
        studentList.add("Alice");
        studentList.add("Bob"); 
        studentList.add("Charlie");

        //Print the list of students
        System.out.println("List of students:");
        System.out.println(studentList);
          
        // Check names and remove them from the list when found.
        Scanner scanner = new Scanner(System.in);
        String nameToCheck;
        do {
            System.out.print("Enter a name to check (or type 'done' to finish): ");
            nameToCheck = scanner.nextLine().trim();
            if (!nameToCheck.equalsIgnoreCase("done")) {
                if (hasName(studentList, nameToCheck)) {
                    System.out.println(nameToCheck + " is in the list.");
                    System.out.print("Would you like to delete this student? (y/n): ");
                    String choice = scanner.nextLine().trim();
                    if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
                        deleteStudent(studentList, nameToCheck);
                        System.out.println("Updated list of students: " + studentList);
                    }
                } else {
                    System.out.println(nameToCheck + " is not in list.");
                }
            }
        } while (!nameToCheck.equalsIgnoreCase("done"));
        scanner.close();
    }

    /*
    Used in the main method to print the list of students. Outside the main method.
    */
    public static void printStudentList(ArrayList<String> studentList) {
        for (String student : studentList) {
            System.out.println(student);
        }
    }

    public static boolean hasName(ArrayList<String> studentList, String name) {
        for (String student : studentList) {
            if (student.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public static void deleteStudent(ArrayList<String> studentList, String name) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).equalsIgnoreCase(name)) {
                studentList.remove(i);
                System.out.println(name + " was removed.");
                return;
            }
        }
        System.out.println(name + " is not in list.");
    }
}

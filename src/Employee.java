public class Employee {
    private String name;
    private double salary;
    protected String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
    
    public void giveRaise(double amount) {
        salary += amount;
    }

    public void changeDepartment(String department) {
        setDepartment(department);
    }

    
    // Subclasses can access the protected department field; unrelated classes cannot.
    // A driver can test this by subclassing Employee and reading the inherited field.
    // The private setter cannot be called directly from a driver or subclass.
    // Test it indirectly by calling changeDepartment and checking getDepartment().
    private void setDepartment(String department) {
        this.department = department;
    }
}

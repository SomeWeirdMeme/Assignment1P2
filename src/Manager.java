public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary, department);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{name='" + getName() + "', salary=" + getSalary() + ", department='" + department + "'}";
    }
}

public class InheritanceProblem {
    public static void main(String[] args) {

        Employee e = new Employee("Alice", 50000, "Engineering");
        Employee e2 = new Employee("John", 60000, "Marketing");
        Manager m = new Manager("Bob", 70000, "Sales");
        Manager m2 = new Manager("Jane", 80000, "Marketing");

        System.out.println(e);
        System.out.println(m);
        System.out.println(e2);
        System.out.println(m2);

        e.giveRaise(2000);
        m.giveRaise(10000);

        System.out.println("After raises:");
        System.out.println(e);
        System.out.println(m);
    }
}

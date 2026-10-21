import java.util.*;

// ---------------- Employee Class ----------------
class Employee {

    private int id;
    private String name;
    private int sal;

    public Employee(String name, int id, int sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSal() {
        return sal;
    }
}

// ---------------- Sort By ID ----------------
class SortById implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getId() - e2.getId();
    }
}

// ---------------- Sort By Salary ----------------
class SortBySal implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getSal() - e2.getSal();
    }
}

//by name
class SortByName implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

// ---------------- Main Class ----------------
public class CollectionsApplication3 {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee("ABC", 1, 10000));
        empList.add(new Employee("MNO", 3, 2000));
        empList.add(new Employee("XYZ", 2, 40000));
        empList.add(new Employee("STV", 5, 4000));
        empList.add(new Employee("ABCD", 4, 20000));

        System.out.println("Display data before sorting:");

        for (Employee e : empList) {
            System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
        }

        // 🔹 Sort by ID
        Collections.sort(empList, new SortById());

        System.out.println("\nAfter sorting by ID:");

        for (Employee e : empList) {
            System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
        }

        // 🔹 Sort by Salary
        Collections.sort(empList, new SortBySal());

        System.out.println("\nAfter sorting by Salary:");

        for (Employee e : empList) {
            System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
        }
    }
}
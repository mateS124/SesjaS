package sesja_samodzielna.task8;


public class Employee {
    private final int id;
    private final String name;
    private final int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }



    public int getSalary() {
        return salary;
    }



    @Override
    public String toString() {
        return "Name: " + getName()+ " " +
                "Salary: " + getSalary() + " "
                + "Id: " + getId();


    }
}

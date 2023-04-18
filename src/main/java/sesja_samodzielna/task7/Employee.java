package sesja_samodzielna.task7;


public class Employee {
    private int id;
    private String name;
    private int salary;

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
package sesja_samodzielna.task9;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee (1, "Lukasz", 20000);
        Employee employee2 = new Employee (2, "Anna",15000);
        Employee employee3 = new Employee(3, "Mateusz", 50000000);


        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        System.out.println(salaryMax(list));


    }

    public static Integer salaryMax(List<Employee> list){
        return list.stream()
                .map(Employee::getSalary)
                .max(Comparator.naturalOrder())
                .orElseThrow(NoSuchElementException::new);

    }
}

package sesja_samodzielna.task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Lukasz", 20000);
        Employee employee2 = new Employee(2, "Anna",15000);
        Employee employee3 = new Employee(3, "Mateusz", 50000000);

        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        System.out.println(findFirst(list, 49500));
    }

     public static Employee findFirst(List<Employee> list, int salary){
        return list.stream()
                .filter(Objects::nonNull)
                .filter(e -> e.getSalary() > salary)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Not found"));

     }
}

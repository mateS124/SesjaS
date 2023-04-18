package sesja_samodzielna.task8;

import org.w3c.dom.ls.LSOutput;
import sesja_samodzielna.task7.Employee;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        sesja_samodzielna.task7.Employee employee1 = new sesja_samodzielna.task7.Employee(1, "Lukasz", 20000);
        sesja_samodzielna.task7.Employee employee2 = new sesja_samodzielna.task7.Employee(2, "Anna",15000);
        sesja_samodzielna.task7.Employee employee3 = new sesja_samodzielna.task7.Employee(3, "Mateusz", 50000000);

        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        System.out.println(sortedByLastName(list));

    }

    public static List<Employee> sortedByLastName(List<Employee> list){
        return list.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

    }
}

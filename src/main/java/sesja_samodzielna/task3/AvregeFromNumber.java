package sesja_samodzielna.task3;

import java.util.ArrayList;
import java.util.List;

public class AvregeFromNumber {
    public static void main(String[] args) {

        List<Double> numbers = new ArrayList<>();
        numbers.add(2.3);
        numbers.add(3.5);
        numbers.add(7.4);
        numbers.add(8.3);
        numbers.add(2.9);
        numbers.add(34.0);

        System.out.println(sum(numbers));


    }
    public static double sum(List<Double> numbers){
        return numbers
                .stream()
                .mapToDouble(d -> d)
                .average()
                .getAsDouble();

    }

}
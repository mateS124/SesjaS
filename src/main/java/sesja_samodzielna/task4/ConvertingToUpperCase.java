package sesja_samodzielna.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertingToUpperCase {
    public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("dzis");
            list.add("co" +
                    "s");
            list.add("nie ");
            list.add("idzie");
        System.out.println(toUpperCase(list));

    }

    public static List<String> toUpperCase(List<String> list){
      return   list.stream()
              .map(String::toUpperCase)
              .collect(Collectors.toList());

    }
}

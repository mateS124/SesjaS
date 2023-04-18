package sesja_samodzielna.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnListStartsWith {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("dzis");
        list.add("cos");
        list.add("nie ");
        list.add("idzie");

        System.out.println(startsWith(list, "d", 4));
    }

    public static List<String> startsWith(List<String> list, String a, int length){
        return list.stream()
                .filter(s -> s.startsWith(a))
                .filter(s -> s.length() == length)
                .collect(Collectors.toList());
    }
}

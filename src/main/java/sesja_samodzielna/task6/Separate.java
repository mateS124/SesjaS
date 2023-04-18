package sesja_samodzielna.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Separate {
    public static void main(String[] args) {
   List<Integer> list = new ArrayList<>();
   list.add(5);
   list.add(8);
   list.add(3);
   list.add(9);
   list.add(1);
   list.add(7);

        System.out.println(separateInt(list));
    }

    public static String separateInt(List<Integer> list){
        return list.stream()
                .map(i -> i % 2 ==0 ? "e" + i : "o" + i )
                .collect(Collectors.joining(","));
    }
}

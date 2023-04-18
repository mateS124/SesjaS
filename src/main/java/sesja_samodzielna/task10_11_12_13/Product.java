package sesja_samodzielna.task10_11_12_13;

import java.time.LocalDate;

public interface Product {
     Double getPrice();

     boolean isAvailable(LocalDate localDate);
}

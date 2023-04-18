package sesja_samodzielna.task10_11_12_13;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product milk = new GenericProduct(() -> 10.0, (date) -> date.isAfter(LocalDate.now()));
        Product bread = new GenericProduct(() -> 25.0, (date) -> true);

        Basket basket = new Basket();
        basket.add(milk, 3);
        basket.add(bread, 15);

        List<Product> products = basket.getProductList();
        System.out.println(products);

        products.remove(milk);
        System.out.println(products);
        System.out.println(basket.getProductList());

        basket.remove(milk,5);
        System.out.println(basket.getProductList());
    }
}

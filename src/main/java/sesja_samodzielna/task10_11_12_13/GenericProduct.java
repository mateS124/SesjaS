package sesja_samodzielna.task10_11_12_13;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Supplier;

public class GenericProduct implements Product{
    private  final Supplier<Double> priceSuplier;
    private final Function<LocalDate, Boolean> availabilityFunction;

    public GenericProduct(Supplier<Double> priceSuplier, Function<LocalDate, Boolean> availabilityFunction) {
        this.priceSuplier = priceSuplier;
        this.availabilityFunction = availabilityFunction;
    }

    @Override
    public Double getPrice() {
        return priceSuplier.get();
    }

    @Override
    public boolean isAvailable(LocalDate localDate) {
        return availabilityFunction.apply(localDate);
    }


}

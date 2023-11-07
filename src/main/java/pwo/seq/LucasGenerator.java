package pwo.seq;

 import java.math.BigDecimal;

 public class LucasGenerator extends FibonacciGenerator {
    public LucasGenerator() {
        // Zmiana początkowych wartości na ostatnie wyrazy sekwencji Lucas
        current = new BigDecimal(1);
        f_1 = new BigDecimal(2);
        f_2 = new BigDecimal(1);
    }

    @Override
    public void reset() {
        super.reset();
        // Zmiana początkowych wartości na ostatnie wyrazy sekwencji Lucas
        current = new BigDecimal(1);
        f_1 = new BigDecimal(2);
        f_2 = new BigDecimal(1);
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 1) {
            // Obliczanie wyrazu wstecz na podstawie dwóch kolejnych wyrazów
            BigDecimal temp = f_2;
            f_2 = f_1;
            f_1 = current.subtract(f_2);
            current = temp;
        } else if (lastIndex == 1) {
            current = new BigDecimal(2);
        } else {
            current = new BigDecimal(1);
        }

        lastIndex--;
        return current;
    }
}

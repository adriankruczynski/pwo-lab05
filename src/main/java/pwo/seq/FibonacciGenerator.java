package pwo.seq;

 import java.math.BigDecimal;

 public class FibonacciGenerator extends Generator {
    public FibonacciGenerator() {
        // Zmiana początkowych wartości na ostatnie wyrazy sekwencji Fibonacci
        current = new BigDecimal(1);
        f_1 = new BigDecimal(0);
        f_2 = new BigDecimal(1);
    }

    @Override
    public void reset() {
        super.reset();
        // Zmiana początkowych wartości na ostatnie wyrazy sekwencji Fibonacci
        current = new BigDecimal(1);
        f_1 = new BigDecimal(0);
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
            current = new BigDecimal(0);
        } else {
            current = new BigDecimal(1);
        }

        lastIndex--;
        return current;
    }
}

 package pwo.seq;

 import java.math.BigDecimal;

 public class TribonacciGenerator extends FibonacciGenerator {
    public TribonacciGenerator() {
        // Zmiana początkowych wartości na ostatnie wyrazy sekwencji Tribonacci
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
        f_3 = new BigDecimal(0);
    }

    @Override
    public void reset() {
        super.reset();
        // Zmiana początkowych wartości na ostatnie wyrazy sekwencji Tribonacci
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
        f_3 = new BigDecimal(0);
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            // Obliczanie wyrazu wstecz na podstawie trzech kolejnych wyrazów
            BigDecimal temp = f_3;
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current.subtract(f_2).subtract(f_3);
            current = temp;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }

        lastIndex--;
        return current;
    }
}

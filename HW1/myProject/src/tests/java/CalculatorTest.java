import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testCalculateDiscountWithValidInput() {
        double purchaseAmount = 100.0;
        int discountAmount = 20;

        double discountedAmount = Calculator.calculateDiscount(purchaseAmount, discountAmount);

        // Проверка, что сумма с учетом скидки верно вычислена
        Assertions.assertThat(discountedAmount).isEqualTo(80.0);
    }

    @Test
    public void testCalculateDiscountWithInvalidInput() {
        double purchaseAmount = -100.0;
        int discountAmount = 20;

        // Проверка, что метод выбрасывает исключение при недопустимых аргументах
        Assertions.assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("Invalid input");
    }
}

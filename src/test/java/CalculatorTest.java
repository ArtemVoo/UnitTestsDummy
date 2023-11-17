import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void calculatorAdd() {
        Assert.assertEquals("Returned wrong result", 12, calculator.add(8, 4));
    }

    @Test
    public void calculatorSubtract() {
        Assert.assertEquals("Returned wrong result", 10, calculator.subtract(35, 25));
    }

    @Test
    public void calculatorMultiply() {
        Assert.assertEquals("Returned wrong result", 36, calculator.multiply(6, 6));
    }

    @Test
    public void calculatorDivide() {
        Assert.assertEquals("Returned wrong result", 10, calculator.divide(100, 10));
    }
}

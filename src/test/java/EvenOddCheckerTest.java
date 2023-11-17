import org.junit.Assert;
import org.junit.Test;

public class EvenOddCheckerTest {

    @Test
    public void evenCheck() {
        Assert.assertTrue("Returned result is not even number", EvenOddChecker.check(4));
    }
    @Test
    public void oddCheck(){
        Assert.assertFalse("Returned result is not odd number", EvenOddChecker.check(1));
    }
}

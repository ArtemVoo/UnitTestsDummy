import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(7.0, 5.5);

    @Test
    public void rectangleArea(){
        Assert.assertEquals(38.5, rectangle.getArea(),0.0);
    }
}

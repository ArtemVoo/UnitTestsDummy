import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(7.0, 5.5);

    @Test
    public void getLength() {
        Assert.assertEquals(7, rectangle.getLength(), 0.0);
    }

    @Test
    public void setLength() {
        rectangle.setLength(9);
        Assert.assertEquals(9, rectangle.getLength(), 0.0);
    }

    @Test
    public void getWidth() {
        Assert.assertEquals(5.5, rectangle.getWidth(), 0.0);
    }

    @Test
    public void setWidth() {
        rectangle.setWidth(3.3);
        Assert.assertEquals(3.3, rectangle.getWidth(), 0.0);
    }

    @Test
    public void rectangleArea() {
        Assert.assertEquals(38.5, rectangle.getArea(), 0.0);
    }
}

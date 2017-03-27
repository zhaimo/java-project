import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {
  Rectangle myRectangle = new Rectangle(5, 8);

  @Test
  public void testGetArea() {
    assertEquals(myRectangle.getArea(), 40);
  }

  @Test
    public void testGetPerimeter() {
      assertEquals(myRectangle.getPerimeter(), 26);
  }
  @Test
    public void testLength() {
      assertEquals(myRectangle.length, 5);
  }
  @Test
    public void testWidth() {
      assertEquals(myRectangle.width, 8);
  }

}

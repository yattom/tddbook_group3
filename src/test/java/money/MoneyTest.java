package money;

import org.junit.jpiter.api.Test;
import static org.junit.jpiter.api.Assertions.*;

public class MoneyTest {
  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    five.times(2);
    assertEquals(10, five.amount);
  }
}
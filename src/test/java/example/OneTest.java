package example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OneTest {
  @Test
  public void testDemo() throws Exception {
    One one = new One();
    assertEquals("Welcome to Project Liberty Demo", one.Demo());
  }

}

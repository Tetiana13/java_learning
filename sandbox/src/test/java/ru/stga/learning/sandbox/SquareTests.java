package ru.stga.learning.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;

import ru.stqa.learning.sandbox.Square;

public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square (5);
    s.area();
    Assert.assertEquals(s.area(),25.0);
  }
}

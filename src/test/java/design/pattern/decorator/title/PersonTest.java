package design.pattern.decorator.title;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

  @Test
  public final void test() {
    Person helio = new Helio("Helio Albano");
    Person helioWithTitle = new MrDecorator(helio);
    assertEquals("Mr. Helio Albano", helioWithTitle.getName());
  }

}

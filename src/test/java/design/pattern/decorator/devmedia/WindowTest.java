package design.pattern.decorator.devmedia;

import org.junit.Test;

public class WindowTest {

  @Test
  public final void test() {
    Window simpleWindow = new SimpleWindow();
    Window decoratedWindow = new WindowSideBarDecorator(simpleWindow);
    decoratedWindow.draw();
  }

}
package design.pattern.decorator.devmedia;

public class WindowSideBarDecorator extends WindowDecorator {

  public WindowSideBarDecorator(Window decoratedWindow) {
    super(decoratedWindow);
  }

  @Override
  public void draw() {
    drawSideBar();
    decoratedWindow.draw();
  }

  private void drawSideBar() {
    System.out.println("Draw a sidebar at window");
  }


}

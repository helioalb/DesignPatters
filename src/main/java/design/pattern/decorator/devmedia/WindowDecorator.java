package design.pattern.decorator.devmedia;

abstract class WindowDecorator extends Window {
  protected Window decoratedWindow;

  public WindowDecorator(Window decoratedWindow) {
    this.decoratedWindow = decoratedWindow;
  }

}

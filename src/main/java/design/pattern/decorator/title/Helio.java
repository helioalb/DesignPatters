package design.pattern.decorator.title;

public class Helio extends Person {

  public Helio(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }
}

package me.helioalbano.designpatterns.behavioral.visitor;

public class Dog implements Animal {
  public String name;

  Dog(String name) {
    this.name = name;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}

package me.helioalbano.designpatterns.behavioral.visitor;

public class Cat implements Animal{
  public String name;

  Cat(String name) {
    this.name = name;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}

package me.helioalbano.designpatterns.behavioral.visitor.impl;

import me.helioalbano.designpatterns.behavioral.visitor.Animal;
import me.helioalbano.designpatterns.behavioral.visitor.Visitor;

public class Cat implements Animal {
  public String name;

  public Cat(String name) {
    this.name = name;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}

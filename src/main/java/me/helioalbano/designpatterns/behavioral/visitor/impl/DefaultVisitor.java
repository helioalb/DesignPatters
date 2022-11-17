package me.helioalbano.designpatterns.behavioral.visitor.impl;

import me.helioalbano.designpatterns.behavioral.visitor.Visitor;

public class DefaultVisitor implements Visitor {
  private int animalsVisited = 0;

  @Override
  public void visit(Dog dog) {
    System.out.println("Roof roof to you " + dog.name);
    animalsVisited++;
  }

  @Override
  public void visit(Cat cat) {
    System.out.println("Meaw to you " + cat.name);
    animalsVisited++;
  }

  @Override
  public int getQuantityOfAnimalsVisited() {
    return animalsVisited;
  }
}

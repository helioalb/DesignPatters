package me.helioalbano.designpatterns.behavioral.visitor;

import me.helioalbano.designpatterns.behavioral.visitor.impl.Cat;
import me.helioalbano.designpatterns.behavioral.visitor.impl.Dog;

public interface Visitor {
  void visit(Dog dog);
  void visit(Cat cat);

  int getQuantityOfAnimalsVisited();
}

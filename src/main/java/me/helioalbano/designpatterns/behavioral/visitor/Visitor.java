package me.helioalbano.designpatterns.behavioral.visitor;

public interface Visitor {
  void visit(Dog dog);
  void visit(Cat cat);

  int getQuantityOfAnimalsVisited();
}

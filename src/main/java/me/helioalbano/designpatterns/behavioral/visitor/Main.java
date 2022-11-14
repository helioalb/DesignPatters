package me.helioalbano.designpatterns.behavioral.visitor;

import java.util.List;

public class Main {

  private final List<Animal> animals;
  private final Visitor visitor;

  Main(List<Animal> animals, Visitor visitor) {
    this.animals = animals;
    this.visitor = visitor;
  }

  public int visitAnimals() {
    for (var animal : animals) {
      animal.accept(visitor);
    }

    return visitor.getQuantityOfAnimalsVisited();
  }
}

package me.helioalbano.designpatterns.behavioral.visitor;

import me.helioalbano.designpatterns.behavioral.visitor.impl.Cat;
import me.helioalbano.designpatterns.behavioral.visitor.impl.DefaultVisitor;
import me.helioalbano.designpatterns.behavioral.visitor.impl.Dog;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  @Test
  void seeTheLogs() {
    var animals = Arrays.asList(new Dog("Dorothy"), new Cat("Felix"));
    var visitor = new DefaultVisitor();
    var main = new Main(animals, visitor);

    int expectedNumberOfAnimalsVisited = 2;
    assertEquals(expectedNumberOfAnimalsVisited, main.visitAnimals());
  }
}

package me.helioalbano.designpatterns.behavioral.visitor;

public interface Animal {
  void accept(Visitor visitor);
}

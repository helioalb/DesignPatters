package design.pattern.decorator.title;

abstract class PersonDecorator extends Person {
  protected Person decoratedPerson;

  public PersonDecorator(Person decoratedPerson) {
    this.decoratedPerson = decoratedPerson;
  }

}

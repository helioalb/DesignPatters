package design.pattern.decorator.title;

public class MrDecorator extends PersonDecorator {

  public MrDecorator(Person decoratedPerson) {
    super(decoratedPerson);
  }

  @Override
  String getName() {
    return "Mr. " + this.decoratedPerson.getName();
  }

}

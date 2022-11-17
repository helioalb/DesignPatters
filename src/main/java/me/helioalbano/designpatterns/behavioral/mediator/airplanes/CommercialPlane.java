package me.helioalbano.designpatterns.behavioral.mediator.airplanes;

import me.helioalbano.designpatterns.behavioral.mediator.Mediator;

public class CommercialPlane extends Airplane {

  public CommercialPlane(Mediator mediator) {
    super(mediator);
  }

  @Override
  public String getPrefix() {
    return "ABC123";
  }
}

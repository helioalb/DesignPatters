package me.helioalbano.designpatterns.behavioral.mediator.airplanes;

import me.helioalbano.designpatterns.behavioral.mediator.Mediator;

public class PrivateAirplane extends Airplane {
  public PrivateAirplane(Mediator mediator) {
    super(mediator);
  }

  @Override
  public String getPrefix() {
    return "XPTO987";
  }
}

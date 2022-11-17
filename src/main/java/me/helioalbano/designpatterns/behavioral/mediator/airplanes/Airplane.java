package me.helioalbano.designpatterns.behavioral.mediator.airplanes;

import me.helioalbano.designpatterns.behavioral.mediator.Mediator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Airplane {
  private Logger log = LoggerFactory.getLogger(Airplane.class);
  private final Mediator mediator;

  public Airplane(Mediator mediator) {
    this.mediator = mediator;
  }

  public void asksForPermissionToTakeOff() {
    log.info("Airplane {} asking permission to take off", getPrefix());
    mediator.notify(this, "PERMISSION_TO_TAKE_OFF");
  }

  abstract public String getPrefix();
}

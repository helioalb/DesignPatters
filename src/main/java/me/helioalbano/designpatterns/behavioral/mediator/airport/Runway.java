package me.helioalbano.designpatterns.behavioral.mediator.airport;

import me.helioalbano.designpatterns.behavioral.mediator.Mediator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Runway {
  private Logger log = LoggerFactory.getLogger(Runway.class);
  private final Mediator mediator;
  private boolean busy;

  public Runway(Mediator mediator) {
    this.mediator = mediator;
    this.busy = false;
  }

  public void defineAsBusy() {
    this.busy = true;
  }

  public void defineAsFree() {
    log.info("Runway defined as free");
    this.busy = false;
    this.mediator.notify(this, "RUNWAY_FREE");
  }

  public boolean isBusy() {
    return this.busy;
  }
}

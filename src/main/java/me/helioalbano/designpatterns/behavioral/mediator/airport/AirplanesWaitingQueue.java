package me.helioalbano.designpatterns.behavioral.mediator.airport;

import me.helioalbano.designpatterns.behavioral.mediator.Mediator;
import me.helioalbano.designpatterns.behavioral.mediator.airplanes.Airplane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class AirplanesWaitingQueue {

  private Logger log = LoggerFactory.getLogger(AirplanesWaitingQueue.class);
  private final List<Airplane> airplanes;
  private final Mediator mediator;

  public AirplanesWaitingQueue(Mediator mediator) {
    this.mediator = mediator;
    this.airplanes = new ArrayList<>();
  }

  public void insert(Airplane airplane) {
    this.airplanes.add(airplane);
  }

  public boolean hasAirplaneWaiting() {
    return !this.airplanes.isEmpty();
  }

  public Airplane remove() {
    if (hasAirplaneWaiting())
      return this.airplanes.remove(0);
    return null;
  }

  public int quantity() {
    return this.airplanes.size();
  }
}

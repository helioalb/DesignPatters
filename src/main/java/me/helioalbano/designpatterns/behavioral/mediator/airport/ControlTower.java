package me.helioalbano.designpatterns.behavioral.mediator.airport;

import me.helioalbano.designpatterns.behavioral.mediator.Mediator;
import me.helioalbano.designpatterns.behavioral.mediator.airplanes.Airplane;
import me.helioalbano.designpatterns.behavioral.mediator.airplanes.CommercialPlane;
import me.helioalbano.designpatterns.behavioral.mediator.airplanes.PrivateAirplane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ControlTower implements Mediator {
  private Logger log = LoggerFactory.getLogger(ControlTower.class);
  public final Airplane commercialPlane;
  public final Airplane privatePlane;
  public final Runway runway;
  private final AirplanesWaitingQueue airplanesWaitingQueue;

  public ControlTower() {
    this.commercialPlane = new CommercialPlane(this);
    this.privatePlane = new PrivateAirplane(this);
    this.runway = new Runway(this);
    this.airplanesWaitingQueue = new AirplanesWaitingQueue(this);
  }

  @Override
  public void notify(Object obj, String action) {
    if (obj instanceof Airplane && action == "PERMISSION_TO_TAKE_OFF")
      evaluatesPossibilityOfTakeOff((Airplane) obj);

    if (obj instanceof Runway && action == "RUNWAY_FREE")
      dispachAirplaneWaitingLonger();
  }

  private void dispachAirplaneWaitingLonger() {
    if (airplanesWaitingQueue.hasAirplaneWaiting())
      makeWaitingAirlineAskForPermissionToTakeOff();
  }

  private void makeWaitingAirlineAskForPermissionToTakeOff() {
    Airplane airplane = airplanesWaitingQueue.remove();
    airplane.asksForPermissionToTakeOff();
  }

  private void evaluatesPossibilityOfTakeOff(Airplane airplane) {
    if (runway.isBusy()) {
      putAirplaneInWaitingQueue(airplane);
    } else {
      log.info("Take off Allowed to {}", airplane.getPrefix());
    }
  }

  private void putAirplaneInWaitingQueue(Airplane airplane) {
    log.info("Take off not allowed to {}", airplane.getPrefix());
    log.info("Airplane {} goes to waiting queue", airplane.getPrefix());
    this.airplanesWaitingQueue.insert(airplane);
    log.info("There are {} airplanes waiting", airplanesWaitingQueue.quantity());
  }
}

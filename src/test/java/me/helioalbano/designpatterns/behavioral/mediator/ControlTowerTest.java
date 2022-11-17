package me.helioalbano.designpatterns.behavioral.mediator;

import me.helioalbano.designpatterns.behavioral.mediator.airport.ControlTower;
import org.junit.jupiter.api.Test;

class ControlTowerTest {

  @Test
  void seeLogs() {
    var controlTower = new ControlTower();
    controlTower.runway.defineAsBusy();
    controlTower.commercialPlane.asksForPermissionToTakeOff();
    controlTower.privatePlane.asksForPermissionToTakeOff();
    controlTower.runway.defineAsFree();
    controlTower.runway.defineAsFree();
  }
}

package me.helioalbano.designpatterns.creational.abstractfactory.familia;

import me.helioalbano.designpatterns.creational.abstractfactory.filho.Filho;
import me.helioalbano.designpatterns.creational.abstractfactory.mae.Mae;
import me.helioalbano.designpatterns.creational.abstractfactory.pai.Pai;

public interface FamiliaFactory {
	public Pai getPai();
	public Mae getMae();
	public Filho getFilho();
}

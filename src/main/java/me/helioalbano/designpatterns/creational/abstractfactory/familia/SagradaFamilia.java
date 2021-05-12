package me.helioalbano.designpatterns.creational.abstractfactory.familia;

import me.helioalbano.designpatterns.creational.abstractfactory.filho.Filho;
import me.helioalbano.designpatterns.creational.abstractfactory.filho.Jesus;
import me.helioalbano.designpatterns.creational.abstractfactory.mae.Mae;
import me.helioalbano.designpatterns.creational.abstractfactory.mae.Maria;
import me.helioalbano.designpatterns.creational.abstractfactory.pai.Jose;
import me.helioalbano.designpatterns.creational.abstractfactory.pai.Pai;

public class SagradaFamilia implements FamiliaFactory {

	@Override
	public Pai getPai() {
		return new Jose();
	}

	@Override
	public Mae getMae() {
		return new Maria();
	}

	@Override
	public Filho getFilho() {
		return new Jesus();
	}

}

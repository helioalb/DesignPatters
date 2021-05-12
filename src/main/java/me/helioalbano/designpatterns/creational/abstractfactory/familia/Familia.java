package me.helioalbano.designpatterns.creational.abstractfactory.familia;

import me.helioalbano.designpatterns.creational.abstractfactory.filho.Filho;
import me.helioalbano.designpatterns.creational.abstractfactory.mae.Mae;
import me.helioalbano.designpatterns.creational.abstractfactory.pai.Pai;

public class Familia {
	private Pai pai;
	private Mae mae;
	private Filho filho;

	public Familia(FamiliaFactory factory) {
		this.pai = factory.getPai();
		this.mae = factory.getMae();
		this.filho = factory.getFilho();
	}

	public String getRelation() {
		return this.pai.nomeDoPai() + " é marido de " +
				this.mae.nomeDaMae() + " e pai de " +
				this.filho.nomeDoFilho();
	}
}

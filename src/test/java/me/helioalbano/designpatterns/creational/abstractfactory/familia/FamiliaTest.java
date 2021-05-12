package me.helioalbano.designpatterns.creational.abstractfactory.familia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FamiliaTest {

	@Test
	void test() {
		Familia sagradaFamilia = new Familia(new SagradaFamilia());

		String expected = "José é marido de Maria e pai de Jesus";

		assertEquals(expected, sagradaFamilia.getRelation());
	}

}

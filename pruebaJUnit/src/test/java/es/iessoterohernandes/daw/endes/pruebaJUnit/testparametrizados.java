package es.iessoterohernandes.daw.endes.pruebaJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import es.iessoterohernandez.daw.endes.junit5.Videojuego;

class testparametrizados {

	
	@DisplayName("David")
	@ParameterizedTest(name = "\"{0}\" should be {1}")
	@CsvSource({ "I, 1", "II, 2", "V, 5"})
	void withNiceName(String word, int number) {    }
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	@Test
	void testCompareTo() {
		Assert.assertEquals(testparametrizados.MENOR, .compareTo());
		Assert.assertEquals(testparametrizados.IGUAL, .compareTo());
		Assert.assertEquals(testparametrizados.MAYOR, .compareTo());
	}

	@Test
	void testToString() {
		Assert.assertEquals("I   : \n" + "\tTitulo: " + getTitulo() + "\n"
				+ "\tHoras estimadas: " + getHorasEstimadas() + "\n" + "\tGenero: " + getGenero() + "\n"
				+ "\tcompañia: " + getcompañia(), toString());
	}

	@Test
	void testEqualstestparametrizados() {
		Assert.assertEquals(false, .equals());
		.setTitulo("");
		.setcompañia("");
		Assert.assertEquals(true, .equals());
	
	
	
	

}

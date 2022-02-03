package es.iessoterohernandes.daw.endes.pruebaJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {

	Movimiento m = new Movimiento();
	Movimiento m1 = new Movimiento();
	Movimiento m2 = new Movimiento();

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
	void testGetImporte() {
		m.getImporte();
		// Assert.assertEquals(true, m.getImporte());
	}

	@Test
	void testGetConcepto() {
		m.getConcepto();
		// Assert.assertEquals(true, m.getConcepto());
	}

	@Test
	void testSetConcepto() {
		m.setConcepto("Casa");

	}

	@Test
	void testSetImporte() {
		m.setImporte(321);
		// m1.setImporte(21);
		// Assert.assertEquals(false, m.getImporte());

	}

}

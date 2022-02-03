package es.iessoterohernandes.daw.endes.pruebaJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	Cuenta c = new Cuenta("39834A", "David");

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
	void testIngresar() throws IngresoNegativoException {
		c.ingresar("Pa ti", 1282);

	}

	@Test
	void testRetirar() throws Exception, SaldoInsuficienteException {
		c.retirar("Mio", 500);
	}

	@Test
	void testGetSaldo() {
		c.getSaldo();
	}

	@Test
	void testAddMovimiento() {
		c.addMovimiento(null);
	}

}

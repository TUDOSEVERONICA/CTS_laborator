package ro.ase.csie.cts.g1088.testare.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.csie.cts.g1088.testare.modele.OperatiiMatematice;

class TestOperatiiMatematice {

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSumaValoriNormale() {
		int a=5;
		int b=6;
		int sumaAsteptata=11;
		int sumaCalculata=OperatiiMatematice.suma(a, b);
		assertEquals("Test cu 5 si 6", sumaCalculata, sumaCalculata);

	}

}

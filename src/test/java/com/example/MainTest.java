package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

	String variable;

	@BeforeEach
	void setUp() {
		variable = "Rosa";
	}

	@AfterEach
	void tearDown() {
		variable = null;
	}

	@Test
	void registrarPlanta() {
	}

	@Test
	void buscarPlanta() {
		assertEquals(variable,  "Rosa");
	}

	@Test
	void regarPlanta() {
	}

	@Test
	void diaSiguiente() {
	}
}
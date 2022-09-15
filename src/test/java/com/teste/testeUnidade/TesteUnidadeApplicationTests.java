package com.teste.testeUnidade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TesteUnidadeApplicationTests {

	@Test
	void testandoCPFValido() {
		var valido = ValidadorCpf.validar("172.616.230-32");
		assertEquals(true, valido);
	}

	@Test
	void testandoCPFInvalido() {
		var valido = ValidadorCpf.validar("172.616.230-11");
		assertEquals(false, valido);
	}

}

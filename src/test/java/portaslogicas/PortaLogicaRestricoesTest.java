package portaslogicas;

import static org.fest.assertions.Assertions.assertThat;
import static org.fest.assertions.Fail.fail;

import org.junit.Test;

public class PortaLogicaRestricoesTest {

	@Test
	public void portaComUmaEntradaNaoLigarEntradaNegativa() {
		PortaLogica porta = new NOT();
		
		try {
			porta.ligar(-1);
			fail("Não deveria aceitar entrada negativa.");
		} catch (RuntimeException e) {
			assertThat(e.getMessage()).isEqualTo("Valor indice de entrada deve ser >= 0.");
		}
		
	}
	
	@Test
	public void portaComUmaEntradaNaoDesligarEntradaNegativa() {
		PortaLogicaEntradaUnica porta = new NOT();
		
		try {
			porta.desligar(-1);
			fail("Não deveria aceitar entrada negativa.");
		} catch (RuntimeException e) {
			assertThat(e.getMessage()).isEqualTo("Valor indice de entrada deve ser >= 0.");
		}
		
	}
	
	@Test
	public void portaComUmaEntradaNaoLigarEntradaMaiorQueZero() {
		PortaLogicaEntradaUnica porta = new NOT();
		
		try {
			porta.ligar(1);
			fail("Não deveria aceitar entrada maior que limite.");
		} catch (RuntimeException e) {
			assertThat(e.getMessage()).isEqualTo("Valor indice de entrada deve ser < 1.");
		}
		
	}
	
	@Test
	public void portaComUmaEntradaNaoDesligarEntradaMaiorQueZero() {
		PortaLogicaEntradaUnica porta = new NOT();
		
		try {
			porta.desligar(1);
			fail("Não deveria aceitar entrada maior que limite.");
		} catch (RuntimeException e) {
			assertThat(e.getMessage()).isEqualTo("Valor indice de entrada deve ser < 1.");
		}
		
	}
	
	@Test
	public void portaComDuasEntradasNaoLigarEntradaNegativa() {
		PortaLogica porta = new AND();
		
		try {
			porta.ligar(-1);
			fail("Não deveria aceitar entrada negativa.");
		} catch (RuntimeException e) {
			assertThat(e.getMessage()).isEqualTo("Valor indice de entrada deve ser >= 0.");
		}
		
	}
	
	@Test
	public void portaComDuasEntradaNaoDesligarEntradaNegativa() {
		PortaLogicaDuasEntradas porta = new OR();
		
		try {
			porta.desligar(-1);
			fail("Não deveria aceitar entrada negativa.");
		} catch (RuntimeException e) {
			assertThat(e.getMessage()).isEqualTo("Valor indice de entrada deve ser >= 0.");
		}
		
	}
	
	@Test
	public void portaComDuasEntradasNaoLigarEntradaMaiorQueUm() {
		PortaLogicaDuasEntradas porta = new XNOR();
		
		try {
			porta.ligar(2);
			fail("Não deveria aceitar entrada maior que limite.");
		} catch (RuntimeException e) {
			assertThat(e.getMessage()).isEqualTo("Valor indice de entrada deve ser < 2.");
		}
		
	}
	
	@Test
	public void portaComDuasEntradasNaoDesligarEntradaMaiorQueUm() {
		PortaLogica porta = new XOR();
		
		try {
			porta.desligar(2);
			fail("Não deveria aceitar entrada maior que limite.");
		} catch (RuntimeException e) {
			assertThat(e.getMessage()).isEqualTo("Valor indice de entrada deve ser < 2.");
		}
		
	}
	
}

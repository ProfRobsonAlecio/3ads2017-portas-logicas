package portaslogicas;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class XNORTest {

	@Test
	public void entradas0e0Saida1() {
		XNOR xnor = new XNOR();
		
		xnor.desligar(0);
		xnor.desligar(1);
		
		assertThat(xnor.getSaida()).isTrue();
	}
	
	@Test
	public void entradas0e1Saida1() {
		XNOR xnor = new XNOR();
		
		xnor.desligar(0);
		xnor.ligar(1);
		
		assertThat(xnor.getSaida()).isFalse();
	}
	
	@Test
	public void entradas1e0Saida1() {
		XNOR xnor = new XNOR();
		
		xnor.ligar(0);
		xnor.desligar(1);
		
		assertThat(xnor.getSaida()).isFalse();
	}
	
	@Test
	public void entradas1e1Saida1() {
		XNOR xnor = new XNOR();
		
		xnor.ligar(0);
		xnor.ligar(1);
		
		assertThat(xnor.getSaida()).isTrue();
	}
	
}

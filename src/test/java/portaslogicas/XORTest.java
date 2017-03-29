package portaslogicas;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class XORTest {

	@Test
	public void entradas0e0Saida0() {
		XOR xor = new XOR();
		
		xor.desligar(0);
		xor.desligar(1);
		
		assertThat(xor.getSaida()).isFalse();
	}
	
	@Test
	public void entradas0e1Saida1() {
		XOR xor = new XOR();
		
		xor.desligar(0);
		xor.ligar(1);
		
		assertThat(xor.getSaida()).isTrue();
	}
	
	@Test
	public void entradas1e0Saida1() {
		XOR xor = new XOR();
		
		xor.ligar(0);
		xor.desligar(1);
		
		assertThat(xor.getSaida()).isTrue();
	}
	
	@Test
	public void entradas1e1Saida0() {
		XOR xor = new XOR();
		
		xor.ligar(0);
		xor.ligar(1);
		
		assertThat(xor.getSaida()).isFalse();
	}
}

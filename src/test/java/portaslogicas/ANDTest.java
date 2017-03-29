package portaslogicas;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class ANDTest {

	@Test
	public void entradas0e0Saida0() {
		AND and = new AND();
		
		and.desligar(0);
		and.desligar(1);
		
		assertThat(and.getSaida()).isFalse();
	}
	
	@Test
	public void entradas0e1Saida0() {
		AND and = new AND();
		
		and.desligar(0);
		and.ligar(1);
		
		assertThat(and.getSaida()).isFalse();
	}
	
	@Test
	public void entradas1e0Saida0() {
		AND and = new AND();
		
		and.ligar(0);
		and.desligar(1);
		
		assertThat(and.getSaida()).isFalse();
	}
	
	@Test
	public void entradas1e1Saida1() {
		AND and = new AND();
		
		and.ligar(0);
		and.ligar(1);
		
		assertThat(and.getSaida()).isTrue();
	}
}

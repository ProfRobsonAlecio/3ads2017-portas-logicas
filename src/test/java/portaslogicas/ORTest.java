package portaslogicas;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class ORTest {
	
	@Test
	public void entradas0e0Saida0() {
		OR or = new OR();
		
		or.desligar(0);
		or.desligar(1);
		
		assertThat(or.getSaida()).isFalse();
	}

	@Test
	public void entradas0e1Saida1() {
		OR or = new OR();
		
		or.desligar(0);
		or.ligar(1);
		
		assertThat(or.getSaida()).isTrue();
	}
	
	@Test
	public void entradas1e0Saida1() {
		OR or = new OR();
		
		or.ligar(0);
		or.desligar(1);
		
		assertThat(or.getSaida()).isTrue();
	}
	
	@Test
	public void entradas1e1Saida1() {
		OR or = new OR();
		
		or.ligar(0);
		or.ligar(1);
		
		assertThat(or.getSaida()).isTrue();
	}
	
}

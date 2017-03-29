package portaslogicas;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class NORTest {

	@Test
	public void entradas0e0Saida1() {
		NOR nor = new NOR();
		
		nor.desligar(0);
		nor.desligar(1);
		
		assertThat(nor.getSaida()).isTrue();
	}

	@Test
	public void entradas0e1Saida0() {
		NOR nor = new NOR();
		
		nor.desligar(0);
		nor.ligar(1);
		
		assertThat(nor.getSaida()).isFalse();
	}
	
	@Test
	public void entradas1e0Saida0() {
		NOR nor = new NOR();
		
		nor.ligar(0);
		nor.desligar(1);
		
		assertThat(nor.getSaida()).isFalse();
	}
	
	@Test
	public void entradas1e1Saida0() {
		NOR nor = new NOR();
		
		nor.ligar(0);
		nor.ligar(1);
		
		assertThat(nor.getSaida()).isFalse();
	}
	
}

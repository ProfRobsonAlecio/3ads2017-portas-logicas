package portaslogicas;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class NOTTest {

	@Test
	public void entrada1Saida0() {
		NOT not = new NOT();
		not.ligar(0);
		
		assertThat(not.getSaida()).isFalse();
	}
	
	@Test
	public void entrada0Saida1() {
		NOT not = new NOT();
		not.desligar(0);
		
		assertThat(not.getSaida()).isTrue();
	}
}

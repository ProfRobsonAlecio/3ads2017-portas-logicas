package portaslogicas;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class NANDTest {

	@Test
	public void entradas0e0Saida1() {
		NAND nand = new NAND();
		
		nand.desligar(0);
		nand.desligar(1);
		
		assertThat(nand.getSaida()).isTrue();
	}
	
	@Test
	public void entradas0e1Saida1() {
		NAND nand = new NAND();
		
		nand.desligar(0);
		nand.ligar(1);
		
		assertThat(nand.getSaida()).isTrue();
	}
	
	@Test
	public void entradas1e0Saida1() {
		NAND nand = new NAND();
		
		nand.ligar(0);
		nand.desligar(1);
		
		assertThat(nand.getSaida()).isTrue();
	}
	
	@Test
	public void entradas1e1Saida0() {
		NAND nand = new NAND();
		
		nand.ligar(0);
		nand.ligar(1);
		
		assertThat(nand.getSaida()).isFalse();
	}
}

package portaslogicas;

public abstract class PortaLogica {

	protected boolean[] entradas;
	
	protected PortaLogica(int quantidadeEntradas) {
		entradas = new boolean[quantidadeEntradas];
	}
	
	public void ligar(int entrada) {
		validarEntrada(entrada);
		
		entradas[entrada] = true;
	}
	
	public void desligar(int entrada) {
		validarEntrada(entrada);
		
		entradas[entrada] = false;
	}
	
	private void validarEntrada(int entrada) {
		if (entrada < 0)
			throw new RuntimeException("Valor indice de entrada deve ser >= 0.");

		if (entrada >= entradas.length)
			throw new RuntimeException(String.format("Valor indice de entrada deve ser < %d.", entradas.length));
	}

	public abstract boolean getSaida();
	
}

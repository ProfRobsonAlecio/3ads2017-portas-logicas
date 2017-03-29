package portaslogicas;

public class OR extends PortaLogicaDuasEntradas {

	@Override
	public boolean getSaida() {
		return entradas[0] || entradas[1];
	}

}

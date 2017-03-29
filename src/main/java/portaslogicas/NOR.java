package portaslogicas;

public class NOR extends PortaLogicaDuasEntradas {

	@Override
	public boolean getSaida() {
		return !(entradas[0] || entradas[1]);
	}

}

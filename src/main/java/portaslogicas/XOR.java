package portaslogicas;

public class XOR extends PortaLogicaDuasEntradas {

	@Override
	public boolean getSaida() {
		if (!entradas[0] && !entradas[1])
			return false;
		
		if (entradas[0] && entradas[1])
			return false;
		
		return true;
	}

}

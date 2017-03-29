package portaslogicas;

public class XNOR extends PortaLogicaDuasEntradas {

	@Override
	public boolean getSaida() {
		if (!entradas[0] && !entradas[1])
			return true;
		
		if (entradas[0] && entradas[1])
			return true;
		
		return false;
	}

}

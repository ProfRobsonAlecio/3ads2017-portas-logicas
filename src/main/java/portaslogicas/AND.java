package portaslogicas;

public class AND extends PortaLogicaDuasEntradas {

	@Override
	public boolean getSaida() {
		return entradas[0] && entradas[1];
	}

}

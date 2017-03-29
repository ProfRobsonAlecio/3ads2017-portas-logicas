package portaslogicas;

public class NOT extends PortaLogicaEntradaUnica {

	@Override
	public boolean getSaida() {
		return !entradas[0];
	}

}

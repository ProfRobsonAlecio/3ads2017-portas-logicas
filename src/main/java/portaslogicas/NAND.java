package portaslogicas;

public class NAND extends PortaLogicaDuasEntradas {

	@Override
	public boolean getSaida() {
		return !(entradas[0] && entradas[1]);
	}

}

package sub_sis_01.cep;

public class CepServ {

	private static CepServ instancia = new CepServ();

	private CepServ() {
		super();
	}

	public static CepServ getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Anápolis";
	}
	
	public String recuperarEstado(String cep) {
		return "GO";
	}
}

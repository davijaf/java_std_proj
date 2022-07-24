package gof.facade;

import sub_sis_01.cep.CepServ;
import sub_sis_02.crm.CrmServ;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepServ.getInstancia().recuperarCidade(cep);
		String estado = CepServ.getInstancia().recuperarEstado(cep);
		
		CrmServ.gravarCliente(nome, cep, cidade, estado);
	}
}

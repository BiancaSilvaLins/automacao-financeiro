package servico.utils;

import br.gov.capes.financeiro.servico.soap.*;
import servico.cliente.WSClient;



/*
 * 
 * A ideia desta classe é representar todas as chamadas ao metodos necessarios do servico financeiro
 * 
 * 
 */


public class ServicoUtils {


	public static RetornoCriacao gerarSLR(DadosCriacao dados) {
		RetornoCriacao rc = null;
		validaDados(dados);
		rc = WSClient.getWSClient().gerar(dados);
		return rc;
	}

	public static RetornoPopular popularPBI(DadosPopularBPI dados) {
		RetornoPopular rp = null;
		validaDados(dados);
		rp = WSClient.getWSClient().popularBPI(dados);
		return rp;
	}

	public static RetornoConfirmarSLR confirmarSLR(DadosConfirmarSLR dados) {
		RetornoConfirmarSLR rcs = null;
		validaDados(dados);
		rcs = WSClient.getWSClient().confirmarSLR(dados);
		return rcs;
	}
	

	public static void validaDados(Object object) {
		if (object == null) {
			throw new RuntimeException(">>>>>>>     Dados nao pode ser nulo!!!!!!!!!!");
		}
	}
	
	/*
	 
	  public String numeroSLR(){ ConfirmarSLR confirmar = new ConfirmarSLR();
	  confirmar.setUp(); String slr = confirmar.confirmarSLR(); return slr; }
	 
	 */
	
}

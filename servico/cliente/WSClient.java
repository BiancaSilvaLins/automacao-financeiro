package servico.cliente;

import br.gov.capes.financeiro.servico.soap.ServicosSLR;
import br.gov.capes.financeiro.servico.soap.ServicosSLR_Service;

public class WSClient {

   private static ServicosSLR_Service webService;
   private static  ServicosSLR webServiceInterface;

    
    /*
     * Este metodo retorna uma implementacao do servico
     * ServicosSLR interface, contem todos os metodos do servicos
     * ServicosSLR_Service me retorna uma implementacao do servico atraves do metodo getServicosSLRImplPort();
     */
    
    public static ServicosSLR getWSClient() {

        //ServiceImpl
        webService = new ServicosSLR_Service();

        //Service Interface
        webServiceInterface = webService.getServicosSLRImplPort();

        return webServiceInterface;
    }

}

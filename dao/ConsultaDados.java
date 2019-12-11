package dao;

public class ConsultaDados extends ConsultaDadosGeneric {

	public static void alterarPerfilContra(int perfil) {
		
		executeQueryContra(QueryUpdate.alteraPerfilContra(perfil));
		closeAllConnectionsBD();
	}
	
	public static void alterarPerfilSadmin(int perfil) {
			
			executeQuerySadmin(QueryUpdate.alteraPerfilSadmin(perfil));
			closeAllConnectionsBD();
	}
	
	public static void inserePerfilContra() {
		executeQueryContra(QueryUpdate.insereVisualizador());
		closeAllConnectionsBD();
	}
	
	public static void deletaPerfilContra() {
		executeQueryContra(QueryUpdate.removeVisualizador());
		closeAllConnectionsBD();
	}
}

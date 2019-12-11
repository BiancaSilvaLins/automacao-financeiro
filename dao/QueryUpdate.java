package dao;

public class QueryUpdate {
	
	public static final int CONTRA_Administrador = 379;
	public static final int CONTRA_Visualizador = 378;
	public static final int CONTRA_Gestor_CGOF = 380;
	public static final int CONTRA_Gestor_COF = 381;
	public static final int CONTRA_Gestor_DEF = 382;
	public static final int CONTRA_Gestor_DCON = 383;
	public static final int CONTRA_Programacao_Orcamentaria = 384;
	public static final int CONTRA_Execucao_Orcamentaria = 385;
	public static final int CONTRA_Execucao_Financeira = 386;
	public static final int CONTRA_Pagamento_Exterior = 387;
	public static final int CONTRA_Tecnico_CPC = 641;
	
	public static final int Consulta_Financeiro = 1004;
	public static final int Administrador_Financeiro = 994;
	public static final int Gestor_CGOF	= 995;
	public static final int Gestor_COF = 996;
	public static final int Gestor_DEF = 998;
	public static final int Gestor_DCON	= 997;
	public static final int Programacao_Orcamentaria = 1001;
	public static final int Execucao_Orcamentaria = 1002;
	public static final int Execucao_Financeira = 1003;
	public static final int Pagamento_Exterior = 1000;
	public static final int Tecnico_CPC = 999;


	public static String alteraPerfilContra(int perfil) {
		String update = "update contra.aplicacao_grupo_usuario set id_aplicacao_grupo = " +  perfil 
				+ " where id_usuario = 340564 and id_aplicacao_grupo_usuario = 504313";
		return update;
	}
	
	public static String alteraPerfilSadmin(int perfil) {
		String update = "UPDATE SEGURANCA.USUARIO_GRUPO SET ID_GRUPO = " +  perfil + " WHERE ID_USUARIO_GRUPO = 406802089";
		return update;
	}
	
	public static String insereVisualizador() {
		String insert = "insert into contra.aplicacao_grupo_usuario ( id_usuario, id_aplicacao_grupo) " + 
				"values ( '340564', '378');";
		return insert;
	}
	
	public static String removeVisualizador () {
		String delete = "delete from contra.aplicacao_grupo_usuario " + 
				"where id_aplicacao_grupo = 378 and  id_usuario = 340564 ;";
		return delete;
	}

}

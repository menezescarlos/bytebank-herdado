package br.com.alura.heranca.modelo.conexao;

public class TestaConexao {
	
	public static void main(String[] args) {
		/*Conexao con = null;
		try{
		    con = new Conexao();
		    con.leDados();
		    con.fecha();
		} catch(IllegalStateException ex){
		    System.out.println("Deu erro na conexão");
		} finally {
		    con.fecha();
		}*/
		
		//FORMA ATUALDE FAZER O TRAY CATCH
		try(Conexao conexao = new Conexao()){
			 conexao.leDados();
		}catch(IllegalStateException ex){
		    System.out.println("Deu erro na conexão");
		}
	}

}

package dione_develop93.AEP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class SolicitacaoRepositoryPersistent implements SolicitacaoRepository {

	private Connection conexao;
	
	public SolicitacaoRepositoryPersistent() {
		abrirConexao();
	}
	
	public void abrirConexao() {
		
		try {
			
			try {
				conexao = DriverManager.getConnection("jdbc:h2:~/aep3s","sa","");
				conexao.close();
				
			} catch (Exception e) {
				System.out.println("Esse banco ja foi criado ...");
			}
			
			conexao = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/aep3s","sa","");
			
			PreparedStatement psCreateTable = conexao.prepareStatement("create table if not exists solicitacao ("
					+ "nome varchar(40) not null, "
					+ "cpf varchar(11) not null, "
					+ "email varchar(40) not null, "
					+ "assunto varchar(50) not null, "
					+ "descricao varchar(300) not null, "
					+ "status varchar(20) not null, "
					+ "prioridade varchar(20) not null, "
					+ "tipo_solicitacao varchar(30) not null, "
					+ "protocolo integer not null "
					+ ")");
			psCreateTable.execute();
			psCreateTable.close();
			System.out.println("Tabela criada");
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void salvar(Solicitacao novo) {
		try {
			PreparedStatement psInsert = conexao.prepareStatement(
					"insert into solicitacao (nome,cpf,email,assunto,descricao,status,prioridade,tipo_solicitacao, protocolo)"
					+ "				 values (    ?,  ?,    ?,      ?,        ?,     ?,         ?,               ?,         ?)");
			psInsert.setString(1, novo.getNome());
			psInsert.setString(2, novo.getCpf());
			psInsert.setString(3, novo.getEmail());
			psInsert.setString(4, novo.getAssunto());
			psInsert.setString(5, novo.getDescricao());
			psInsert.setString(6, novo.getStatus());
			psInsert.setString(7, novo.getPrioridade());
			psInsert.setString(8, novo.getTipo_solicitacao());
			psInsert.setInt(9, novo.getProtocolo());
			psInsert.execute();
			psInsert.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void excluir(Solicitacao solicitacao) {
		try {
			PreparedStatement psDelete = conexao.prepareStatement("delete from solicitacao where protocolo = ?");
			psDelete.setInt(1, solicitacao.getProtocolo());
			psDelete.execute();
			psDelete.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public List<Solicitacao> obtertodas() {
		List<Solicitacao> todas = new ArrayList<>();
		try {
			PreparedStatement psSelect = conexao.prepareStatement(
					"select nome,cpf,email,assunto,descricao,status,prioridade,tipo_solicitacao,protocolo from solicitacao");
			ResultSet rsTodas = psSelect.executeQuery();
			while (rsTodas.next()) {
				Solicitacao recuperada = new Solicitacao(
						rsTodas.getString("nome"),
						rsTodas.getString("cpf"),
						rsTodas.getString("email"),
						rsTodas.getString("assunto"),
						rsTodas.getString("descricao"),
						rsTodas.getString("status"),
						rsTodas.getString("prioridade"),
						rsTodas.getString("tipo_solicitacao"),
						rsTodas.getInt("protocolo"));
				todas.add(recuperada);
			}
			psSelect.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return todas;
	}
	
}

package dione_develop93.AEP;

import java.util.List;

public interface SolicitacaoRepository {
	
	void salvar(Solicitacao nova);
	
	void excluir(Solicitacao solicitacao);
	
	List<Solicitacao>obtertodas();

}

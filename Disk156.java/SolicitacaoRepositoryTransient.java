package dione_develop93.AEP;

import java.util.ArrayList;
import java.util.List;


public class SolicitacaoRepositoryTransient implements SolicitacaoRepository{
	
private List<Solicitacao> solicitacao = new ArrayList<>();
	
	public void salvar(Solicitacao novo) {
		solicitacao.add(novo);
	}
	
	public void excluir(Solicitacao protocolo) {
		solicitacao.remove(protocolo);
	}

	
	public List<Solicitacao> obtertodas() {
		return solicitacao;
	}
	
}

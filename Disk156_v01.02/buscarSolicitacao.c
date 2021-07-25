#include "tipos.h"

TElementoSolicitacao* buscarNaLista(TListaSolicitacao *pb, int valorBusca){



    TElementoSolicitacao *aux;
    aux = pb->inicio;

    while (aux != NULL && aux->protocolo != valorBusca) {

        aux = aux->proximo;
    }
    return aux;
}

void buscarSolicitacao(TListaSolicitacao *pb) {

   if(pb->inicio != NULL) {

        int valorBusca;
        printf("\n Informe o Protocolo: ");
        scanf("%d",&valorBusca);

        TElementoSolicitacao *elementoBusca;
        elementoBusca = buscarNaLista(pb,valorBusca);
        if( elementoBusca != NULL) {

            printf("\nNome: %s",elementoBusca->cidadao.nome);
            printf("\nCPF: %s",elementoBusca->cidadao.cpf);
            printf("\nEmail: %s", elementoBusca->cidadao.email);

            printf("\n\nAssunto: %s",elementoBusca->assunto);
            printf("\nDescricao: %s",elementoBusca->descricao);
            printf("\nStatus: %s",elementoBusca->status);
            printf("\nTipo Solicitacao: %s",elementoBusca->tipoSolicitacao);
            printf("\nPrioridade: %s",elementoBusca->prioridade);
            printf("\nProtocolo: %d\n",elementoBusca->protocolo);
        }else {
            printf("\nSolicitacao nao encontrada");
        }

    }else {
        printf("\nLista vazia\n");
    }

    system("pause");


}

#include "tipos.h"

void apresentarSolicitacaoPendente( TListaSolicitacao *pb) {

 if(pb->inicio != NULL) {

        system("cls");
        printf("......:::::: LISTA DE SOLICITACOES PENDENTES ::::::......\N\N");

        TElementoSolicitacao *auxSolicitacao;


        auxSolicitacao = pb->inicio;
        int i = 0;
        while(auxSolicitacao != NULL) {

            printf("\nSolicitacao [%d]: \n",i+1);
            printf("\nNome: %s",auxSolicitacao->cidadao.nome);
            printf("\nCPF: %s",auxSolicitacao->cidadao.cpf);
            printf("\nEmail: %s", auxSolicitacao->cidadao.email);

            printf("\n\nAssunto: %s",auxSolicitacao->assunto);
            printf("\nDescricao: %s",auxSolicitacao->descricao);
            printf("\nStatus: %s",auxSolicitacao->status);
            printf("\nTipo Solicitacao: %s",auxSolicitacao->tipoSolicitacao);
            printf("\nPrioridade: %s",auxSolicitacao->prioridade);
            printf("\nProtocolo: %d",auxSolicitacao->protocolo);
            printf("\n====================================\n");

            auxSolicitacao = auxSolicitacao-> proximo;
            i++;
        }

    }else {

        printf("Lista vazia!\n");

    }

    system("pause");

}

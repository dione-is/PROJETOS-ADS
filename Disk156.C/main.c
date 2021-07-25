#include "tipos.h"

int main() {

    TListaSolicitacao listaSolicitacao;

    inicializar(&listaSolicitacao);
    int opcao;
    do{
        system("cls");
        printf(".....::::::::: MENU CIDADAO ::::::::::......\n\n");

        printf("[1] Para realizar uma solicitacao.\n\n");

        printf("==================================================");

        printf("\n\n.....::::::::: MENU FUNCIONARIO ::::::::::......\n\n");

        printf("[2] Apresentar Solicitacoes Pendentes ou em Analise.\n");
        printf("[3] Encerrar Solicitacao.\n");
        printf("[4] Buscar Solicitacoes.\n");
        printf("[0] Sair\n");
        scanf("%d",&opcao);

        switch(opcao) {

            case 1: inserirSolicitacao(&listaSolicitacao);break;
                case 2: apresentarSolicitacaoPendente(&listaSolicitacao);break;
                    case 3: encerrarSolicitacao(&listaSolicitacao);break;
                        case 4: buscarSolicitacao(&listaSolicitacao);break;


        }



    }while(opcao != 0);


}

#include "tipos.h"

void inserirSolicitacao(TListaSolicitacao *pb) {

    system("cls");
    srand(time(NULL));
     // novo =  new TElemento;
    TElementoSolicitacao *novoSolicitacao;
    novoSolicitacao = (TElementoSolicitacao*) malloc(sizeof(TElementoSolicitacao));
    int opcao=0;
    int simOUnao=0;
    printf("qual tipo Solicitacao voce deseja? : \n");
    do{
        printf("\n[1] Denuncia ou Reclamacao       [2]Solicitar Servicos         [3]Elogios ou Sugestoes \n");
        scanf("%d",&opcao);
        if(opcao > 3 || opcao < 1 ){
            printf("\nOpcao Invalida ! Por favor insira um numero entre 1 e 3.");
        }
            if(opcao == 1){
                strcpy(novoSolicitacao->tipoSolicitacao,"Denuncia ou Reclamacao");
                strcpy(novoSolicitacao->prioridade,"Alta");

            }else
                if(opcao == 2){
                    strcpy(novoSolicitacao->tipoSolicitacao,"Solicitacao Servicos");
                    strcpy(novoSolicitacao->prioridade,"Normal");
                }else
                    if(opcao == 3) {
                        strcpy(novoSolicitacao->tipoSolicitacao,"Elogio ou Sugestoes");
                        strcpy(novoSolicitacao->prioridade,"Baixa");
                    }

    }while(opcao > 3 || opcao < 1);

    // novo =  new TElemento;


    if(opcao ==1){
        printf("\nDeseja se identificar? [1]SIM  [0]NAO ");
        scanf("%d",&simOUnao);
    }
        if(opcao != 1 || simOUnao == 1){
            printf(".....:::::::: FORMULARIO DE IDENTIFICACAO :::::::::......\n\n");

            do{
                printf("\nInforme seu nome: ");
                fflush(stdin);
                gets(novoSolicitacao->cidadao.nome);
                if(strlen(novoSolicitacao->cidadao.nome)< 3) {
                    printf("\Nome invalido! o nome deve conter mais que 2 caracteres.");
                    printf("\nDigite Novamente!");
                }
            }while(strlen(novoSolicitacao->cidadao.nome) < 3);

            do{
                printf("\nInforme seu cpf: ");
                fflush(stdin);
                gets(novoSolicitacao->cidadao.cpf);

                if(strlen(novoSolicitacao->cidadao.cpf)!= 11){
                    printf("\nCPF Invalido! O CPF deve conter 11 caracteres");
                    printf("\nDigite Novamente!");
                }
            }while(strlen(novoSolicitacao->cidadao.cpf)!= 11);

            int passa = 0;
            do{
                printf("\nInforme seu email: ");
                fflush(stdin);
                gets(novoSolicitacao->cidadao.email);
                int arroba,ponto,maior,c_P,c_S,i;
                int tam=strlen(novoSolicitacao->cidadao.email);
                char teste='.';

                 for (int i = 0; i < tam; i++) {
                   if(novoSolicitacao->cidadao.email[i] > 3){
                     maior=1;
                   }if(novoSolicitacao->cidadao.email[i] == '@'){
                    arroba=1;

                   }if(arroba == 1 &&  novoSolicitacao->cidadao.email[i] >= 3){
                    c_P=1;
                   }if(novoSolicitacao->cidadao.email[i]=='.'){
                        ponto=1;
                       }if(ponto=1 && novoSolicitacao->cidadao.email >=2){
                        c_S=1;
                   }

                    if(maior==1 && arroba == 1 && c_P==1 && c_S ==1){
                        passa=1;
                     }else{
                        passa=0;
                    }
                }

                if(passa == 0){
                    printf("\nEmail Invalido !!!!");
                    printf("\nDigite Novamente!");
                }else {
                    passa ==1;
                }

            }while(passa == 0);

        }else{
            strcpy(novoSolicitacao->cidadao.nome,"ANONIMO");
            strcpy(novoSolicitacao->cidadao.cpf, "ANONIMO");
            strcpy(novoSolicitacao->cidadao.email,"ANONIMO");
        }


        printf("\n\n .......:::::::: FORMULARIO DE SOLICITACAO :::::::::........\n\n");

        do{
            printf("\nAssunto: \n");
            fflush(stdin);
            gets(novoSolicitacao->assunto);
            if(strlen(novoSolicitacao->assunto)<=3){
                printf("\nAssunto deve conter mais que 3 caracteres");
                printf("\nDigite Novamente:");
            }

        }while(strlen(novoSolicitacao->assunto)<= 3);

        do{
            printf("\nDescricao: \n");
            fflush(stdin);
            gets(novoSolicitacao->descricao);
            if(strlen(novoSolicitacao->descricao)< 20 || strlen(novoSolicitacao->descricao)> 3000){
                printf("A descricao deve ter no minimo 20 caracteres e no maximo 3000.");
                printf("\nDigite Novamente:");
            }
        }while(strlen(novoSolicitacao->descricao)< 20 || strlen(novoSolicitacao->descricao)> 3000);

        strcpy(novoSolicitacao->status,"Pendente");
        novoSolicitacao->protocolo =  (rand()%999)+1;
        novoSolicitacao->proximo = NULL;

        if (pb->inicio == NULL) {

            pb->inicio = novoSolicitacao;
            pb->fim = novoSolicitacao;
         } else {

            pb->fim->proximo = novoSolicitacao;
            pb->fim = novoSolicitacao;
        }


    printf("\n\nAPERTE ENTER PARA ENVIAR !\n");
    system("pause");
}

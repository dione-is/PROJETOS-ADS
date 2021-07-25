#ifndef _tipos_
#define _tipos_

#include <conio.h>
#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

typedef struct tipoElementoCidadao {

    char nome[30];
    char cpf[15];
    char email[40];

}TElementoCidadao;


typedef struct tipoElementoSolicitacao {

    //char dataInicio[10]; não conseguimos comando para pegar a data atual do sistema.
    //char dataTermino[10];não conseguimos comando para pegar a data atual do sistema.
    char assunto[30];
    char descricao[3000];
    char status[10];
    char prioridade[10];
    char tipoSolicitacao[30];
    int protocolo;
    TElementoCidadao cidadao;
    //char departamento[10]; enum.
    struct tipoElementoSolicitacao *proximo;

}TElementoSolicitacao;

typedef struct tipoListaSolicitacao {

    TElementoSolicitacao *inicio;
    TElementoSolicitacao *fim;

}TListaSolicitacao;

void inicializar (TListaSolicitacao *pb);
void inserirSolicitacao (TListaSolicitacao *pb);
void apresentarSolicitacaoPendente(TListaSolicitacao *pb);
void encerrarSolicitacao(TListaSolicitacao *pb);
void buscarSolicitacao(TListaSolicitacao *pb);


#endif // _tipos_

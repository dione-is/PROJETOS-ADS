#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#include <conio.c>
#include <string.h>
#include <time.h>
#include <ctype.h>


typedef struct tipoProduto{
	char nome[30];
	char dataPlantio[9];
	int  prazoColheita;
	float terreno;
}TProduto;

typedef struct tipoNo
{
	TProduto produto;
	struct tipoNo *esq;
	struct tipoNo *dir;
}TNo;

TNo* inserir (TNo *raiz, TProduto produto)
{
	if (raiz == NULL)
	{
		raiz = new TNo;
		raiz->produto = produto;
		raiz->esq = NULL;
		raiz->dir = NULL;
	}
	else
	{
		if (strcmp(produto.nome, raiz->produto.nome) < 0)
		{
			raiz->esq = inserir (raiz->esq, produto); //EM ESPERA
		}
		else
		{
			raiz->dir = inserir (raiz->dir, produto);
		}
	}
	return raiz;
}

	




void emOrdem(TNo *raiz){
    
	if (raiz != NULL)
	{
		emOrdem(raiz->esq);
		printf("\n=====================================");
		printf("\n|  Nome: %s",raiz->produto.nome);
		printf("\n|  Data Plantio: %s", raiz->produto.dataPlantio);
		printf("\n|  Prazo Colheita: %d dias",raiz->produto.prazoColheita);
		printf("\n|  Terreno: %.2f metros quadrados",raiz->produto.terreno);
		printf("\n=====================================");
	    emOrdem(raiz->dir);
		
	}
}

void relatorio(){
     
     textcolor(1);
     gotoxy(20,15);printf("|\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/");
     gotoxy(20,16);printf("|\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/");
     gotoxy(20,17);printf("|\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/");
     gotoxy(41,19);printf("\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");                                 
     gotoxy(41,20);printf("\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");                 
     gotoxy(41,21);printf("\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");
     
     textcolor(15);
     gotoxy(53,15);printf("\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");
     gotoxy(53,16);printf("\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");
     gotoxy(53,17);printf("\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");
     gotoxy(20,18);printf("|\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");
     gotoxy(29,22);printf("\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");
     gotoxy(29,23);printf("\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");
     gotoxy(29,24);printf("\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|\n");
     
     textcolor(2);
     gotoxy(73,19);printf("\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");                                 
     gotoxy(73,20);printf("\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");                 
     gotoxy(73,21);printf("\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");
     
     textcolor(4);
     gotoxy(20,19);printf("|\\|/ \\|/ \\|/ \\|/ \\|/");                                 
     gotoxy(20,20);printf("|\\|/ \\|/ \\|/ \\|/ \\|/");                 
     gotoxy(20,21);printf("|\\|/ \\|/ \\|/ \\|/ \\|/");
     gotoxy(20,22);printf("|\\|/ \\|/");
     gotoxy(20,23);printf("|\\|/ \\|/");
     gotoxy(20,24);printf("|\\|/ \\|/\n");
    
     }


int main()
{
	TNo *raiz;
    raiz = NULL;
    TProduto auxProduto;

    CONSOLE_CURSOR_INFO cursor = {1, FALSE};
    SetConsoleCursorInfo(GetStdHandle(STD_OUTPUT_HANDLE), &cursor);
       
    int op = 1;
    char tecla;


    do{
    
        textcolor(8);
        textbackground(0);
        system("cls");
        gotoxy(20,1);printf(" _____    _____    _____      _____   _____     ____    _    _   _____\n");
        gotoxy(20,2);printf("|  __ \\  |_   _|  / ____|    / ____| |  __ \\   / __ \\  | |  | | |  __ \\\n");
        gotoxy(20,3);printf("| |  | |   | |   | |  __    | |  __  | |__) | | |  | | | |  | | | |__) |\n");
        gotoxy(20,4);printf("| |  | |   | |   | | |_ |   | | |_ | |  _  /  | |  | | | |  | | |  ___/\n");
        gotoxy(20,5);printf("| |__| |  _| |_  | |__| |   | |__| | | | \\ \\  | |__| | | |__| | | |\n");
        gotoxy(20,6);printf("|_____/  |_____|  \\_____|    \\_____| |_|  \\_\\  \\____/   \\____/  |_|\n");
    


       textcolor(5);
       textbackground(0);
       gotoxy(50,10); printf(" Produtos   ");
       gotoxy(50,11); printf(" Analisar Solo ");
       gotoxy(50,12); printf(" Configuracoes ");
       gotoxy(50,13); printf(" Creditos   ");
       gotoxy(50,14); printf(" Fim        ");

       textcolor(0);
       textbackground(15);

       switch (op){
          case 1:
             gotoxy(50,10); printf(" Produtos      ");
             break;
          case 2:
             gotoxy(50,11); printf(" Analisar Solo ");
             break;
          case 3:
             gotoxy(50,12); printf(" Configuracoes ");
             break;
          case 4:
             gotoxy(50,13); printf(" Creditos      ");
             break;
          case 5:
             gotoxy(50,14); printf(" Fim           ");
             break;

        }

        tecla=getch();

        if (tecla<0)
          tecla=getch();

        switch (tecla){
           case 72:
             if (op-1>=1)
                 op--;
                 else
                 op=5;
             break;
           case 80:
             if (op+1<=5)
                 op++;
                 else
                 op=1;
             break;
           case 13:

             if(op==1){
                       
                       do{
                     textcolor(4);
                     textbackground(0);
                     gotoxy(70,10); printf(" Inserir Produto               ");
                     gotoxy(70,11); printf(" Apresentar Produto - Pre-Ordem");
                     gotoxy(70,12); printf(" Apresentar Produto - Em-Ordem ");
                     gotoxy(70,13); printf(" Apresentar Produto - Pos-Ordem");
                     gotoxy(70,14); printf(" Sair                          ");

                     textcolor(4);
                     textbackground(15);
                     switch (op){
                          case 1:
                             gotoxy(70,10); printf(" Inserir Produto               ");
                             break;
                          case 2:
                             gotoxy(70,11); printf(" Apresentar Produto - Pre-Ordem");
                             break;
                          case 3:
                             gotoxy(70,12); printf(" Apresentar Produto - Em-Ordem ");
                             break;
                          case 4:
                             gotoxy(70,12); printf(" Apresentar Produto - Pos-Ordem");
                             break;
                          case 5:
                             gotoxy(70,12); printf(" Sair                          ");
                             break;
                             }

                      tecla=getch();

                      if (tecla<0)
                         tecla=getch();

                      switch (tecla){
                             case 72:
                                  if (op-1>=1)
                                     op--;
                                  else
                                      op=5;
                                      break;
                             case 80:
                                  if (op+1<=5)
                                     op++;
                                  else
                                      op=1;
                                      break;
                             case 13:
                                  if(op==1)
                                           game(30);

                                  else
                                      if(op==2)
                                               game(10);

                                      else
                                          if(op==3)
                                                   game(1);
                                                  }

                     }
                     while(tecla!=27 && tecla!=13);
                     tecla=0;
                     op=1;
                     }
                       
                       textbackground(0);
                       textcolor(15);
                       system("cls");
	                   char valor;
	                   int opcao;
	                   
	                   if(raiz == NULL){
                           printf("Nao existem produtos cadastrado\n\n");
                           printf("Inserir novo produto ?[1]Sim [2]Nao\n");
                           scanf("%d",&opcao);
                           if(opcao == 1) {
                                printf("Informe o nome do Produto: ");
                                fflush(stdin);
                                gets(auxProduto.nome);
                                printf("informe a data de plantio: ");
                                fflush(stdin);
                                gets(auxProduto.dataPlantio);
                                printf("Prazo para colheita(dias): ");
                                scanf("%d",&auxProduto.prazoColheita);
                                printf("tamanho do terreno(metro quadrados): ");
                                scanf("%f",&auxProduto.terreno);
                                
                                raiz = inserir(raiz,auxProduto);
                           }
                       }else {                               
                    		emOrdem(raiz); 
                            printf("\nInserir novo produto ?[1]Sim [2]Nao\n");
                            scanf("%d",&opcao);
                            if(opcao == 1) {
                                printf("Informe o nome do Produto: ");
                                fflush(stdin);
                                gets(auxProduto.nome);
                                printf("informe a data de plantio: ");
                                fflush(stdin);
                                gets(auxProduto.dataPlantio);
                                printf("Prazo para colheita(dias): ");
                                scanf("%d",&auxProduto.prazoColheita);
                                printf("tamanho do terreno(metro quadrados): ");
                                scanf("%f",&auxProduto.terreno);
                                
                                raiz = inserir(raiz,auxProduto);
                            }                         
                       }        
                       
                       system("pause");
             }

             if (op==2){
             
              int contador,linha,coluna,nitrogenio; 
              contador= 0; linha = 3; coluna = 30;   
              do{   
                  Sleep(10); 
                  int progresso=0;
                  textbackground(0);
                  textcolor(15);
                  system("cls");
                  if(contador < 50 ){
                      gotoxy(coluna,linha+1);printf("   -----|----- ");
                      gotoxy(coluna,linha+2);printf("*>=====[_]L)   ");
                      gotoxy(coluna,linha+3);printf("      -'-'-    ");
                      gotoxy(coluna,linha+4);printf("       ....    ");
                      gotoxy(coluna,linha+5);printf("     . . . . .    ");
                      gotoxy(coluna,linha+6);printf("   . . . .  . .   ");
                      gotoxy(coluna,linha+7);printf("  . . . . .  .  . ");
                      gotoxy(coluna,linha+8);printf(".S. C. A.N .N E. R.");
                      coluna++;      
                      }else{
                            gotoxy(coluna,linha+1);printf("    -----|-----    ");
                            gotoxy(coluna,linha+2);printf("      (J[_]=====<* ");
                            gotoxy(coluna,linha+3);printf("       -'-'-       ");
                            gotoxy(coluna,linha+4);printf("       ....       ");
                            gotoxy(coluna,linha+5);printf("     . . . . .    ");
                            gotoxy(coluna,linha+6);printf("   . . . .  . .   ");
                            gotoxy(coluna,linha+7);printf("  . . . . .  .  . ");
                            gotoxy(coluna,linha+8);printf(".S. C. A.N .N E. R."); 
                            coluna --;                 
                            }   
                  
                  gotoxy(20,15);printf("|\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");
                  gotoxy(20,16);printf("|\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");
                  gotoxy(20,17);printf("|\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");
                  gotoxy(20,18);printf("|\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");
                  gotoxy(20,19);printf("|\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");                                 
                  gotoxy(20,20);printf("|\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");                 
                  gotoxy(20,21);printf("|\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");
                  gotoxy(20,22);printf("|\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");
                  gotoxy(20,23);printf("|\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|");
                  gotoxy(20,24);printf("|\\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/ \\|/|\n");
                  contador++;
                  }while(contador<110);
                  relatorio();
                      
              system("pause");
                    }
              if (op==3){
                         /*arquivo(0);
                         Score();*/

                        }

              if (op==4){

                  textbackground(0);
                  textcolor(4);
                  system("cls");
                  gotoxy(30,10);printf("Aluno:      Dione Aparecido Inacio dos Santos");
                  gotoxy(30,11);printf("Faculdade:  UNICESUMAR - MARINGA");
                  gotoxy(30,12);printf("Curso:      ANALISE E DESENVOLVIMENTO DE SISTEMA");
                  gotoxy(30,13);printf("Turma:      2ºSemestre - 2020");
                  gotoxy(30,14);printf("Professor:  Alexandre Moreno\n\n");
                  system("pause");
                        }

             if (op==5)
                tecla=27;
             break;

        
      }

    }while(tecla != 27);
}



#include "tipos.h"



void encerrarSolicitacao(TListaSolicitacao *pb) {

    //qual elemento excluir?
   int valorExclusao;
   printf("\n Digite o Protocolo da Solicitacao que deseja encerrar: ");
   scanf("%d", &valorExclusao);

   TElementoSolicitacao *atual;
   TElementoSolicitacao *anterior;

   atual = pb->inicio;
   anterior = pb->inicio;


   while (atual != NULL)
   {
      if (atual->protocolo == valorExclusao)
      {
         if (atual == pb->inicio)  //para o inicio da lista
         {
            pb->inicio = atual->proximo;
         }
         else //no meio da lista
         {
            anterior->proximo = atual->proximo;
            if (atual == pb->fim)
            {
               pb->fim = anterior;
            }
         }
         free(atual);
         break;
      }
      else
      {
         anterior = atual;
         atual = atual->proximo;
      }
   }

   if (atual == NULL)
   {
      printf("\n Elemento nao encontrado\n");
   }
   else
   {
      printf("\n Elemento excluido com sucesso!\n");
   }
   system("pause");
}

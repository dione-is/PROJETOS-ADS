
#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#include <conio.c>
#include <time.h>
#include <ctype.h>


int col, lin, c, l,pontoJogador,x,scorePonto[4];
char scoreNome[4][30],nomeJogador[30];
void carro(int coluna, int linha);
void car();
void car2();
void gameover();
void explosao(int x, int y);
void menu();
void game(int nivel);

void arquivo(int tp);
void classificaScore();
void Score();

FILE *pFile;

int main(){


  CONSOLE_CURSOR_INFO cursor = {1, FALSE};
  SetConsoleCursorInfo(GetStdHandle(STD_OUTPUT_HANDLE), &cursor);

  arquivo(0);
  menu();





   return(0);
}


void menu(){
int op=1,cor = 0;
char tecla;

 do{

        if(cor == 0 || cor % 16 == 0)
               cor++;

        textcolor(cor);
        textbackground(0);
        system("cls");
        gotoxy(30,1);printf(" ########     ###     ######  #### ##    ##  ######       #######   #######");
        gotoxy(30,2);printf(" ##     ##   ## ##   ##    ##  ##  ###   ## ##    ##     ##     ## ##     ##");
        gotoxy(30,3);printf(" ##     ##  ##   ##  ##        ##  ####  ## ##           ##     ##        ##");
        gotoxy(30,4);printf(" ########  ##     ## ##        ##  ## ## ## ##   ####     ########  ####### ");
        gotoxy(30,5);printf(" ##   ##   ######### ##        ##  ##  #### ##    ##            ##        ##");
        gotoxy(30,6);printf(" ##    ##  ##     ## ##    ##  ##  ##   ### ##    ##     ##     ## ##     ##");
        gotoxy(30,7);printf(" ##     ## ##     ##  ######  #### ##    ##  ######       #######   #######");
        cor++;
        pontoJogador = 0;
        col=60;lin=12; c=80;l=5;

       textcolor(8);
       textbackground(0);
       gotoxy(50,10); printf(" Jogar      ");
       gotoxy(50,11); printf(" Instrucoes ");
       gotoxy(50,12); printf(" Scores     ");
       gotoxy(50,13); printf(" Creditos   ");
       gotoxy(50,14); printf(" Fim        ");

       textcolor(0);
       textbackground(15);

       switch (op){
          case 1:
             gotoxy(50,10); printf(" Jogar      ");
             break;
          case 2:
             gotoxy(50,11); printf(" Instrucoes ");
             break;
          case 3:
             gotoxy(50,12); printf(" Scores     ");
             break;
          case 4:
             gotoxy(50,13); printf(" Creditos   ");
             break;
          case 5:
             gotoxy(50,14); printf(" Fim        ");
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
                     gotoxy(70,10); printf(" Facil      ");
                     gotoxy(70,11); printf(" Normal ");
                     gotoxy(70,12); printf(" Dificil     ");

                     textcolor(4);
                     textbackground(15);
                     switch (op){
                          case 1:
                            gotoxy(70,10); printf(" Facil      ");
                             break;
                          case 2:
                             gotoxy(70,11); printf(" Normal ");
                             break;
                          case 3:
                             gotoxy(70,12); printf(" Dificil     ");
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
                                      op=3;
                                      break;
                             case 80:
                                  if (op+1<=3)
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

             if (op==2){

                  textbackground(0);
                  textcolor(9);
                  system("cls");
                  gotoxy(30,10);printf("Sobe       -> seta para cima");
                  gotoxy(30,11);printf("Desce      -> seta para baixo");
                  gotoxy(30,12);printf("Frente     -> seta para direita");
                  gotoxy(30,13);printf("Atras      -> seta para esquerda");
                  gotoxy(30,14);printf("Selecionar -> Enter");
                  gotoxy(30,15);printf("Voltar     -> ESC\n\n");
                  system("pause");
                        }
              if (op==3){
                         arquivo(0);
                         Score();

                        }

              if (op==4){

                  textbackground(0);
                  textcolor(10);
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
      }
      while (tecla!=27);
    }
    //------------------------------------------------------------------------------
     void game( int nivel){

          srand(time(NULL));
       int co = 5, li = 10,tecla = 0;


       do{
          Sleep(nivel);
          carro(co,li);
          car();
          if(nivel < 30 && col < 50 || c <50 ){
                 car2();
                         }

          if(li==lin && co+17 == col ||
                     li+1==lin && co+17 ==col ||
                     li+2==lin && co+17 ==col ||
                     li==lin+1 && co+17 ==col ||
                     li==lin+2 && co+17 ==col ||
                     li==lin+3 && co==col ||
                     li+3==lin && co==col ||
                     li==l+3 && co==c ||
                     li+3==l && co==c ||
                     li== l && co+17 == c ||
                     li+1== l && co+17 == c ||
                     li+2== l && co+17 == c ||
                     li== l+1 && co+17 == c ||
                     li== l+2 && co+17 == c){
                        explosao(li,co);
                        tecla = 27;
                        }

          if (kbhit())
        {
          tecla = getch();
            if (tecla==224)
               tecla=getch();

          switch (tecla){
              case 72:
                if (li-1>=4)
                  li--;
                break;

              case 80:
    	        if (li+1<=12)
                  li++;
                break;

              case 75:
    	        if (co-1>=1)
    	           co--;

                break;

              case 77:
                if (co+1<=70)
                  co++;

                break;
            }
        }
        if(nivel ==30 )
                 pontoJogador++;
        else
            if(nivel == 10)
                     pontoJogador=pontoJogador +2;
        else
            if(nivel == 1)
                     pontoJogador = pontoJogador +3;

      }while (tecla!=27);
     }
 //------------------------------------------------------------------
    void carro(int coluna, int linha){
        system("cls");
        textbackground(1);
        gotoxy(80,1);printf("Pontos: %d  ",pontoJogador);
        textbackground(0);
        gotoxy(1,2);printf("=====================================================================================================");
        gotoxy(1,3);printf("=====================================================================================================");
        gotoxy(1,3);printf("=====================================================================================================");
        gotoxy(1,4);printf("=====================================================================================================");
        gotoxy(coluna,linha); printf("    ________\n");
        gotoxy(coluna,linha+1); printf("   /__\\\\____\\____\n");
        gotoxy(coluna,linha+2); printf("  /-._.|-_.|__._.o\\\n");
        gotoxy(coluna,linha+3); printf("='--(@)--------(@)-\n");
        gotoxy(1,16);printf("=====================================================================================================");
        gotoxy(1,17);printf("=====================================================================================================");
        gotoxy(1,18);printf("=====================================================================================================");
        gotoxy(1,19);printf("=====================================================================================================");
        gotoxy(1,20);printf("=====================================================================================================");

        }
//------------------------------------------------------------------
    void car(){
      textcolor(15);
      gotoxy(col,lin); printf("    ________\n");
      gotoxy(col,lin+1); printf("   /__\\\\____\\____\n");
      gotoxy(col,lin+2); printf("  /-._.|-_.|__._.o\\\n");
      gotoxy(col,lin+3); printf("='--(@)--------(@)-\n");
      col--;

      if (col<1){
          do{
              lin=(rand()%12)+1;}
          while(lin >13 || lin <5);
          col=80;
      }

    }
//------------------------------------------------------------------
    void car2(){


          textcolor(15);
          gotoxy(c,l); printf("    ________\n");
          gotoxy(c,l+1); printf("   /__\\\\____\\____\n");
          gotoxy(c,l+2); printf("  /-._.|-_.|__._.o\\\n");
          gotoxy(c,l+3); printf("='--(@)--------(@)-\n");
          c--;
          if(c < 1){
              do{
                  l=(rand()%12)+1;
                  c=80;}
              while(l >13 || l <5); }
          }
//------------------------------------------------------------------
    void gameover(){
            textcolor(15);
            system("cls");
            gotoxy(10,11);printf("     ######      ###    ##     ## ########     #######  ##     ## ######## ########");
            gotoxy(10,12);printf("    ##    ##    ## ##   ###   ### ##          ##     ## ##     ## ##       ##     ##");
            gotoxy(10,13);printf("    ##         ##   ##  #### #### ##          ##     ## ##     ## ##       ##     ##");
            gotoxy(10,14);printf("    ##   #### ##     ## ## ### ## ######      ##     ## ##     ## ######   ########");
            gotoxy(10,15);printf("    ##    ##  ######### ##     ## ##          ##     ##  ##   ##  ##       ##   ##");
            gotoxy(10,16);printf("    ##    ##  ##     ## ##     ## ##          ##     ##   ## ##   ##       ##    ##");
            gotoxy(10,17);printf("     ######   ##     ## ##     ## ########     #######     ###    ######## ##     ##");
            printf("\n ");
            gotoxy(10,22);printf("DIGITE O NOME DO JOGADOR: ");
            gets(nomeJogador);
            classificaScore();
            arquivo(1);
            system("pause");

         }
//------------------------------------------------------------------
    void explosao(int x, int y){

         textcolor(4);
         Sleep(300);
         Beep(690,100);
         gotoxy(y,x+2);printf("        ** **          ");
         Sleep(300);
         Beep(690,100);
         gotoxy(y,x+1);printf("  *** ** *** ** ***    ");
         gotoxy(y,x+3);printf("  *** ** *** ** ***    ");
         Sleep(300);
         Beep(690,100);
         gotoxy(y,x);printf("* * * * * * * * * * * *");
         gotoxy(y,x+4);printf("* * * * * * * * * * * *");
         Sleep(300);
         Beep(690,100);
         gotoxy(y,x-1);printf("*** * * * * * * * * * * *");
         gotoxy(y,x+5);printf("*** * * * * * * * * * * *");
         Sleep(300);

         gameover();
         }

//------------------------------------------------------------------
    void arquivo(int tp){

        pFile = fopen ("pontuacao.txt","r");
        if (pFile == NULL || tp==1){
          pFile = fopen ("pontuacao.txt","w");
          for (x=0;x<=3; x++)
             fprintf (pFile, "%d%s \n", scorePonto[x], scoreNome[x]);
        }
        else {
           for (x=0; x<=3; x++){
             fscanf (pFile, "%d", &scorePonto[x]);
             fscanf (pFile, "%[^\n]s",scoreNome[x]);
             scoreNome[x][strlen(scoreNome[x])]='\0';
           }
        }
      fclose(pFile);
    }
//------------------------------------------------------------------
    void classificaScore(){
    char nometmp[30];
    int  x,y,pontotmp;
       strcpy(scoreNome[3],nomeJogador);
       scorePonto[3]=pontoJogador;
       for (x=0;x<=2;x++)
          for (y=x+1;y<=3;y++)
            if (scorePonto[y]>scorePonto[x])
            {
               strcpy(nometmp,scoreNome[x]);
               strcpy(scoreNome[x],scoreNome[y]);
               strcpy(scoreNome[y],nometmp);

               pontotmp     =scorePonto[x];
               scorePonto[x]=scorePonto[y];
               scorePonto[y]=pontotmp;
            }
    }
//------------------------------------------------------------------
    void Score(){
      textcolor(6);
      textbackground(0);
      system("cls");
      for (x=0; x<=2; x++)
         printf ("%d.o colocado %4d %s\n",x+1,scorePonto[x],scoreNome[x]);

      printf("\n\n");
    system("pause");}
//------------------------------------------------------------------

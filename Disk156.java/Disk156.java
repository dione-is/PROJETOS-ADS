package dione_develop93.AEP;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Disk156 {
	
	
	public static void main(String[] args) throws IOException {
		
		Random aleatorio = new Random();
		Scanner ler = new Scanner(System.in);		
		int opcao;
		
		SolicitacaoRepository  BD = new SolicitacaoRepositoryPersistent();		
		do {
			System.out.println( "::::::::: Disk 156 Maringa :::::::::" );
			System.out.println("\n [1]Realizar uma solicitacao");
			System.out.println(" [2]Apresentar Solitações");
			System.out.println(" [3]Encerrar Solicitação");
			System.out.println(" [0]Sair\n");
				opcao = ler.nextInt();
				switch(opcao) {
					case 1: Solicitacao.inserirSolicitacao(BD);break;
						case 2: Solicitacao.imprimirSolicitacaoNoConsole(BD);break;
							case 3:Solicitacao.excluirSolicitacao(BD);break;
				}
				if(opcao < 0 || opcao >3) {
					System.out.println("Numero invalido! insira uma das opções [1],[2],[3],[0]");
				}
		}while(opcao != 0);		
		
	}
	
}

package dione_develop93.AEP;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;


public class Solicitacao {
	
	private String nome;
	private static String cpf;
	private String email;
	private String assunto;
	private String descricao;
	private String status;
	private String prioridade;
	private String Tipo_solicitacao;
	private int	   protocolo;
	
	public Solicitacao (String nome, String cpf, String email, String assunto, String descricao,
						String status, String prioridade, String tipo_solicitacao, int protocolo) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.assunto = assunto;
		this.descricao = descricao;
		this.status = status;
		this.prioridade = prioridade;
		this.Tipo_solicitacao = tipo_solicitacao;
		this.protocolo = protocolo;
	}
	
	public static String setNome(String nome) {
		Scanner ler = new Scanner(System.in);
		do{
			 nome = ler.nextLine();
			if (nome == null || nome.trim().length() == 0 || nome.trim().split(" ").length < 2) {
				System.out.println("Nome não pode ser nulo, nem vazio e deve ser composto por 2 palavras!");
				System.out.println("Tente Novamente ! \nNome:");
			}
			
		}while(nome == null || nome.trim().length() == 0 || nome.trim().split(" ").length < 2);
		return nome;
	}

	public String getNome() {
		return nome;
	}	

	public String getCpf() {
		return cpf;
	}	

	public String getEmail() {
		return email;
	}	

	public String getAssunto() {
		return assunto;
	}	

	public String getDescricao() {
		return descricao;
	}

	public String getStatus() {
		return status;
	}	

	public String getPrioridade() {
		return prioridade;
	}	

	public String getTipo_solicitacao() {
		return Tipo_solicitacao;
	}

	public int getProtocolo() {
		return protocolo;
	}
	
	public static void excluirSolicitacao(SolicitacaoRepository BD) throws IOException {
		Scanner ler = new Scanner(System.in);
		int valor,cont = 0;
		
		System.out.println("Informe o protocolo");
		valor = ler.nextInt();
		
		for (Solicitacao c : BD.obtertodas()) {			
			if(valor == c.getProtocolo()) {
				BD.excluir(c);
				cont++;
			}
		}
		
		if(cont > 0)
			System.out.println("Solicitacao excluida");
		else
			System.out.println("Não encontrado");		
	}

	

	public static void imprimirSolicitacaoNoConsole(SolicitacaoRepository BD) throws IOException {
		System.out.println("::::::: Solicitações ::::::::");
		for (Solicitacao c : BD.obtertodas()) {
			System.out.println("================================================");
			System.out.println("Nome: "+c.getNome()+"\nCPF: "+c.getCpf()+"\nEmail: "+c.getEmail()
								+"\nAssunto: "+c.getAssunto()+"\nDescricao: "+c.getDescricao()+"\nStatus: "+
								c.getStatus()+"\nTipoSolicitacao: "+c.getTipo_solicitacao() + "\nPrioridade: " + c.getPrioridade()
								+"\nProtocolo: "+c.getProtocolo());
		}
		System.out.println("Pressione Enter para Prosseguir ");
		System.in.read();
		
	}

	
	
	public  static void inserirSolicitacao(SolicitacaoRepository BD) {
		
		Scanner ler = new Scanner(System.in);
		Random aleatorio = new Random();
		int protocolo = aleatorio.nextInt(1000);
		int opcaoTipo;
		String tipo, prioridade;
		
		
		System.out.println("[1]Denuncias ou Reclamações  [2]Solicitar Serviços  [3]Sugestões ou Elogios");
		do {
			opcaoTipo = Integer.parseInt( ler.nextLine());
			if(opcaoTipo < 1 || opcaoTipo > 3)
				System.out.println("Numero invalido! escolha uma das opções acima");
		}while(opcaoTipo < 1 || opcaoTipo > 3);
		
		System.out.println("Nome: "); // verficar ler nome e sobrenome juntos.
		String nome= null;
		String nomeValida = null;
		nome = setNome(nomeValida);
		System.out.println("CPF: ");
		String cpfvalida = null;
		String cpf = ValidaCpf(cpfvalida);
		System.out.println("Email: ");
		String emailValida= null;
		String email = ValidarEmail(emailValida);
		System.out.println("Assunto: ");
		String assunto = ler.nextLine();
		System.out.println("Descrição: ");
		String descricao = ler.nextLine();
		String status = "Pendente";
		
		if(opcaoTipo == 1) {
			tipo = "Denuncias ou Reclamações";
			prioridade = "Alta";
			}else
				if(opcaoTipo == 2) {
					tipo = "Solicitar Serviços";
					prioridade = "Media";
					}else {
						tipo = "Sugestões ou Elogios";
						prioridade = "Baixa";
					}
		
		Solicitacao s1 = new Solicitacao(nome,cpf,email,assunto, descricao,status, prioridade, tipo,protocolo);
		BD.salvar(s1);		
	}
	
	public static String ValidarEmail(String email) {
		Scanner ler = new Scanner(System.in);
	    boolean result = true;
	    
		do {
			result = true;
	    	try {
	    		email = ler.nextLine();
		        InternetAddress emailAddr = new InternetAddress(email);
		        emailAddr.validate();
		    } catch (AddressException ex) {
		        result = false;
		        System.out.println("Email invalido! Digite Novamete!\nEmail: ");
		    }
		}while(result == false);
		    
	    return email;
	}
	
	public static String ValidaCpf(String cpf) {
		do {
			Scanner ler = new Scanner(System.in);
			 cpf = ler.nextLine();

		if (cpfInválido(cpf)) {
			//throw new RuntimeException("CPF inválido, verifique!");
			System.out.println("CPF inválido! -" + cpf + "- Verifique!");
			System.out.println("Digite Novamente! \nCPF: ");
		}
		}while(cpfInválido(cpf) != false);
		return cpf;
	}

	

	private static boolean cpfInválido(String valor) {
		valor = valor.replaceAll("\\.", "").replaceAll("-", "");
		//System.out.println(valor);
		return !isCPF(valor);
	}

	private static boolean isCPF(String CPF) {
		// considera-se erro CPF's formados por uma sequencia de numeros iguais
		if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222")
				|| CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555")
				|| CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888")
				|| CPF.equals("99999999999") || (CPF.length() != 11))
			return (false);

		char dig10, dig11;
		int sm, i, r, num, peso;

		// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
		try {
			// Calculo do 1o. Digito Verificador
			sm = 0;
			peso = 10;
			for (i = 0; i < 9; i++) {
				// converte o i-esimo caractere do CPF em um numero:
				// por exemplo, transforma o caractere '0' no inteiro 0
				// (48 eh a posicao de '0' na tabela ASCII)
				num = (int) (CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig10 = '0';
			else
				dig10 = (char) (r + 48); // converte no respectivo caractere numerico

			// Calculo do 2o. Digito Verificador
			sm = 0;
			peso = 11;
			for (i = 0; i < 10; i++) {
				num = (int) (CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig11 = '0';
			else
				dig11 = (char) (r + 48);

			// Verifica se os digitos calculados conferem com os digitos informados.
			if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
				return (true);
			else
				return (false);
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

}

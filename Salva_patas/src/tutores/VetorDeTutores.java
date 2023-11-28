package tutores;

import java.util.Scanner;

import pets.Pets;

public class VetorDeTutores {

	private Tutor[] tutores;
	public Tutor tutorLogado;
	private int quantidadeDeTutores;
	private int tam;

	VetorDeTutores() {

	}

	public VetorDeTutores(int tam) {
		this.tam = tam;
	}

	void setTam(int tam) {
		this.tam = tam;
	}

	int getTam() {
		return tam;
	}

	public void inicializadorTutor() {
		tutores = new Tutor[tam];
		quantidadeDeTutores = 0;
	}

	void mostrarTutores() {

		if (tutores != null) {
			for (int i = 0; i < tutores.length; i++) {
				
				if(tutores[i] != null) {
					System.out.println("Tutor " + (i + 1));
					tutores[i].mostrarDados();
					System.out.println();
				}
			}
		} else {
			System.out.println("Sem tutores cadastrados");

		}
	}

	public void cadastrarTutor(Scanner readerS, Scanner readerI) {

		Tutor tutorTemp = new Tutor();

		System.out.println("Qual o seu nome?");
		tutorTemp.setNome(readerS.nextLine());
		System.out.println("Qual seu telefone?");
		tutorTemp.setTelefone(readerS.nextLine());
		System.out.println("Qual seu cpf?");
		tutorTemp.setCpf(readerS.nextLine());
		System.out.println("Quantos Pets você quer ter?");
		tutorTemp.setQuantidadeDeFilhos(readerI.nextInt());

		tutorTemp.inicializarPetsFilhos();

		adicionarTutor(tutorTemp);

	}

	void adicionarTutor(Tutor tutor) {
		
		System.out.println();
		System.out.println("o tutor foi cadastrado na posição  " + quantidadeDeTutores);
		
		tutorLogado = tutor;
		
		tutor.mostrarDados();
		tutores[quantidadeDeTutores] = tutor;
		
		quantidadeDeTutores++;

	}

	public void adotarPet(Pets petAdotado) {
	
		tutorLogado.adotarPet(petAdotado);
		
	}
	
	public boolean trocarConta(Scanner scan) {
		
		if(quantidadeDeTutores > 0) {
			
			mostrarTutores();
			
			System.out.println("Informe o indice do perfil a logar ");
			int key = scan.nextInt();
			tutorLogado = tutores[key-1];
			
			return true;	
		}else {
			System.out.println("Nenhuma conta do tipo tutor cadastrada. ");
			return false;
		}
		
	}
	
}

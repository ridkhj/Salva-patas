package tutores;

import java.util.Scanner;

import pets.Pets;

public class VetorDeTutores {

	Tutor[] tutores;
	public Tutor tutorLogado;
	int quantidadeDeTutores;
	int tam;

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
				System.out.println("Tutor " + (i + 1));
				tutores[i].imprimeDados();
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
		
		tutor.imprimeDados();
		tutores[quantidadeDeTutores] = tutor;
		
		tutores[quantidadeDeTutores].inicializarPetsFilhos();
		tutorLogado.inicializarPetsFilhos();
		
		quantidadeDeTutores++;

	}

	public void adotarPet(Pets petAdotado) {
	
		tutorLogado.adotarPet(petAdotado);
		
	}
	
}

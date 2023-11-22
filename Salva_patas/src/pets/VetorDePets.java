package pets;

import java.util.Scanner;

public class VetorDePets {

	private Pets[] pets;
	private static int quantidadeDePets;
	private static int petsDisponiveis;
	private int tam;

	public VetorDePets() {

	}

	public VetorDePets(int tam) {
		this.tam = tam;
	}

	public int getTam() {
		return tam;
	}

	public int getLength() {
		return pets.length;
	}

	public void inicializarPets() {

		pets = new Pets[tam];
		quantidadeDePets = 0;

	}

	public void mostrarPets() {

		int i;
		if (pets[0] != null) {
			System.out.println("Todos os pets cadastrados e seus dados.");
			System.out.println();

			for (i = 0; i < pets.length; i++) {

				if (pets[i] != null) {

					System.out.println("Pet " + (i + 1));
					pets[i].imprimirPet();
					System.out.println();
					System.out.println();

				}
			}

		} else {
			System.out.println("Sem pets cadastrados.");
		}

	}

	public void adicionarPet(Pets pet) {

		System.out.println();
		System.out.println("Pet foi cadastrado na posição  " + quantidadeDePets);

		pet.imprimirPet();

		pets[quantidadeDePets] = pet;

		quantidadeDePets++;

	}

	void mostrarPetsDisponiveis() {

		int i;

		if (quantidadeDePets > 0) {
			for (i = 0; i < pets.length; i++) {
				if (pets[i] != null) {
					if (pets[i].getAdotado() == false) {

						System.out.println("Pet " + (i + 1));
						pets[i].imprimirPet();
						System.out.println();
						System.out.println();

					}
				}
			}
		} else {
			System.out.println("Sem pets cadastrados.");
		}
	}

	@SuppressWarnings("unused")
	private void statusPet() {

		System.out.println("Printando status do vetor de pets ");
		for (int i = 0; i < pets.length; i++) {
			if (pets[i] != null) {
				System.out.println("Pet da posicao" + i + " tem nome de" + pets[i].getNome());
			} else {
				System.out.println("Pet da posicao" + i + " eh nulo");
			}
		}
	}

	public void cadastrarPet(Scanner readerS, Scanner readerI) {
		if(!(quantidadeDePets >= pets.length)) {
			int key = 321;
			String especie, nome, raca, coloracao;
		
			
			System.out.println("Cadastro de pet.");
			System.out.println("Em qual opção o animal se encaixa?");
			System.out.println(" [1] É um canino");
			System.out.println(" [2] É um felino");
			System.out.println(" [3] É uma ave");
			System.out.println(" [4] É de outra espécie");
			key = readerI.nextInt();
			
			
			System.out.println("Informe o nome do animal.");
			nome = readerS.nextLine();
			System.out.println("Informe a raca do animal.");
			raca = readerS.nextLine();
			System.out.println("Informe a coloracao do animal.");
			coloracao = readerS.nextLine();
			
		
			if(key == 1) {
				especie = "Canis familiaris";
				Pets petTemporario = new Caninos(especie, nome, raca, coloracao, false);
				adicionarPet(petTemporario);
			}else if(key == 2) {
				especie = "Felis catos";
				Pets petTemporario = new Felinos(especie, nome, raca, coloracao, false);
				adicionarPet(petTemporario);
			}else if(key ==3) {
				especie = "Aves familiaris";
				Pets petTemporario = new Aves(especie, nome, raca, coloracao, false);
				adicionarPet(petTemporario);
			}else {
				System.out.println("Informe a especie do animal.");
				especie = readerS.nextLine();
				Pets petTemporario = new Pets(especie, nome, raca, coloracao, false);
				adicionarPet(petTemporario);
			}
		
		}else {
			System.out.println("Quantidade de pets chegou a lotação maxima disponivel, não será possivel cadastrar.");
		}
	}

	public Pets serAdotado(Scanner scan) {

		checarPetsDisponiveis();
		if (petsDisponiveis > 0) {
			mostrarPetsDisponiveis();

			System.out.println("Informe o indice do pet desejado para adoção.");
			int indiceDoPetAAdotar = scan.nextInt();

			pets[indiceDoPetAAdotar - 1].setAdotado(true);

			return pets[indiceDoPetAAdotar - 1];
		}

		return null;
	}

	public void checarPetsDisponiveis() {
		int i;

		for (i = 0; i < pets.length; i++) {
			if (pets[i] != null) {
				if (pets[i].getAdotado() == false) {

					petsDisponiveis++;

				}
			}
		}
	}

}

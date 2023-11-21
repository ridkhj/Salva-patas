package estabelecimentos;

import java.util.Scanner;

import pets.Pets;
import pets.VetorDePets;


public class Estabelecimento {

	private String nome;
	private String cnpj;
	public VetorDePets petsCadastrados = new VetorDePets(20);

	public Estabelecimento() {

	}

	public Estabelecimento(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return nome;
	}

	public void inicializarPets() {
		petsCadastrados.inicializarPets();
	}

	public void mostrarPets() {
		petsCadastrados.mostrarPets();
	}

	public Pets serAdotado(Scanner scan) {
		return petsCadastrados.serAdotado(scan);
	}

	public void cadastrarPet(Scanner readerS, Scanner readerI ) {
		petsCadastrados.cadastrarPet(readerS, readerI);
	}

	public void mostrarDados() {

		System.out.println("Nome: " + nome);
		System.out.println("Cnpj: " + cnpj);

	}
}

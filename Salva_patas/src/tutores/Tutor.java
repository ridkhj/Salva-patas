package tutores;

import pets.Pets;
import pets.VetorDePets;


public class Tutor {

	private String nome;
	private String telefone;
	private String cpf;
	private VetorDePets petsFilhos;
	private int quantidadeDeFilhos;

	Tutor() {

	}

	Tutor(String nome, String telefone, String cpf) {

		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;

	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setQuantidadeDeFilhos(int quantidadeDeFilhos) {
		this.quantidadeDeFilhos = quantidadeDeFilhos;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public int getQuantidadeDeFilhos() {
		return quantidadeDeFilhos;
	}

	public void inicializarPetsFilhos() {

		petsFilhos = new VetorDePets(quantidadeDeFilhos);
		quantidadeDeFilhos = 0;
		petsFilhos.inicializarPets();

	}

	public void mostrarDados() {

		System.out.println("Nome:" + getNome());
		System.out.println("Telefone:" + getTelefone());
		System.out.println("Dados dos pets. ");
		
		if (petsFilhos == null) {
			System.out.println("Esse tutor não têm pets");
		} else {
			if(quantidadeDeFilhos > 0) {
				mostrarPetsFilhos();
			}else {
				System.out.println("Nem um pet adotado");
			}	
		}

	}
	
	public void adotarPet(Pets petAdotado) {
		petsFilhos.adicionarPet(petAdotado);
		quantidadeDeFilhos++;
	}
	
	public void mostrarPetsFilhos() {
		
		petsFilhos.mostrarPets();
		
	}
	
}

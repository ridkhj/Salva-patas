package pets;

public class Pets {

	String especie;
	String nome;
	String raca;
	String cor;
	boolean adotado;
	
	Pets() {

	}

	Pets(String especie, String nome, String raca, String cor, boolean adotado) {

		this.especie = especie;
		this.nome = nome;
		this.raca = raca;
		this.cor = cor;
		this.adotado = adotado;

	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setAdotado(boolean adotado) {
		this.adotado = adotado;
	}

	public String getEspecie() {
		return especie;
	}

	public String getNome() {
		return nome;
	}

	public String getRaca() {
		return raca;
	}

	public String getCor() {
		return cor;
	}

	public boolean getAdotado() {
		return adotado;
	}

	public void imprimirPet() {
		System.out.println();
		System.out.println("Especie: " + getEspecie());
		System.out.println("Nome: " + getNome());
		System.out.println("Raça: " + getRaca());
		System.out.println("Cor: " + getCor());
		if (getAdotado() == true) {

			System.out.println("Status adotivo: indisponivel");
		} else {

			System.out.println("Status adotivo: disponivel");
		}
	}
	
	void interagir() {
		
		System.out.println("Animal interagindo fisicamente. ");
	} 
	
	
	void emitirSom() {
		
		System.out.println("Animal emitindo som. ");
		
	}

}

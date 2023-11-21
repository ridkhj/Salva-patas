package estabelecimentos;

import java.util.Scanner;
import pets.*;

public class VetorDeEstabelecimentos {

	private Estabelecimento[] estabelecimentos;
	public Estabelecimento estabLogado;
	private int quantidadeDeEstabelecimentos;
	private int tam;
	
	public VetorDeEstabelecimentos(int tam){
		this.tam = tam;
	}
	public void inicializarEstabelecimentos() {

		estabelecimentos = new Estabelecimento[tam];
		quantidadeDeEstabelecimentos = 0;

	}

	public void cadastrarEstabelecimento(Scanner scan) {

		String nome, cnpj;
		System.out.println("Informe o nome do estabelecimento.");
		nome = scan.nextLine();
		System.out.println("Informe o cnpj do estabelecimento.");
		cnpj = scan.nextLine();

		Estabelecimento estabTemp = new Estabelecimento(nome, cnpj);
		
		adicionarEstabelecimento(estabTemp);
		
	}

	private void adicionarEstabelecimento(Estabelecimento estab) {

		estabelecimentos[quantidadeDeEstabelecimentos] = estab;
		estabLogado = estab;
		estabLogado.inicializarPets();
		quantidadeDeEstabelecimentos++;

	}

	public void mostrarEstabelecimentos() {
		int i;
		for (i = 0; i < estabelecimentos.length; i++) {

			System.out.println("Estabelecimento " + (i + 1));
			estabelecimentos[i].mostrarDados();
			System.out.println();

		}
	}

}

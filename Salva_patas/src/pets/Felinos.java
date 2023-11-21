package pets;


public class Felinos extends Pets {
	
	public Felinos(String especie, String nome, String raca, String cor, boolean adotado) {
		super(especie, nome, raca, cor, adotado);
	}
	
	public Felinos() {
		super();
	}


	  	
	    @Override
	    void emitirSom() {
	        System.out.println("Miando");
	    }

	    @Override
	    void interagir() {
	        System.out.println("Esfregando e ronronando");
	    }
		
		
	  
}

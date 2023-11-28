package pets;


public class Felinos extends Pets {
	
	public Felinos(String especie, String nome, String raca, String cor, boolean adotado) {
		super(especie, nome, raca, cor, adotado);
	}
	
	public Felinos() {
		super();
	}


	  	
	    @Override
	    public void emitirSom() {
	        System.out.println(nome + " esta Miando");
	    }

	    @Override
	    public void interagir() {
	        System.out.println(nome + " esta Esfregando e ronronando");
	    }
		
		
	  
}

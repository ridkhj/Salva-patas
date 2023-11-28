package pets;

public class Aves extends Pets {
	
    public Aves(String especie, String nome, String raca, String cor, boolean adotado) {
        super(especie, nome, raca, cor, adotado);
    }
    public Aves() {
        super();
    }
    
    @Override
    public void emitirSom() {
    	System.out.println(" cantando.");
 	
    }
    
    @Override
    public void interagir() {
    	System.out.println(" batendo asas e ciscando.");
    }
}



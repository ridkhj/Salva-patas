package pets;


public class Caninos extends Pets {
	
	
    public Caninos(String especie, String nome, String raca, String cor, boolean adotado) {
        super(especie, nome, raca, cor, adotado);
    }
    
    public Caninos() {
        super();
    }
   
    @Override
    void emitirSom() {
        System.out.println("Latindo");
    }

    @Override
    void interagir() {
        System.out.println("Balançando o rabo");
    }
   
    
}

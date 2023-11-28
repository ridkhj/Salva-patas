package pets;


public class Caninos extends Pets {
	
	
    public Caninos(String especie, String nome, String raca, String cor, boolean adotado) {
        super(especie, nome, raca, cor, adotado);
    }
    
    public Caninos() {
        super();
    }
   
    @Override
    public void emitirSom() {
        System.out.println(nome + " esta Latindo");
    }

    @Override
    public void interagir() {
        System.out.println(nome + " esta Balançando o rabo");
    }
   
    
}

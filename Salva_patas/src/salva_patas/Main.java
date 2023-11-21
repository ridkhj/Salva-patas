package salva_patas;

import java.util.Scanner;

import estabelecimentos.*;
import tutores.VetorDeTutores;

class Main {

	static Scanner readerS;
	static Scanner readerI;
	static VetorDeEstabelecimentos estabelecimentos = new VetorDeEstabelecimentos(20);
	static VetorDeTutores tutores = new VetorDeTutores(20);
	static boolean logado;
	static int login; // 0 = convidado, 2 = tutor, 1 = estabelecimento

	static void aguardar() {

		System.out.println("\nPressione enter para continuar.....");
		readerS.nextLine();

	}

	public static void main(String[] args) {

		readerS = new Scanner(System.in);
		readerI = new Scanner(System.in);
		int key = 3234;
		
		estabelecimentos.inicializarEstabelecimentos();
		tutores.inicializadorTutor();

		System.out.println("[1] Criar conta como estabelecimento de adoção.");
		System.out.println("[2] Criar conta como tutor.");
		System.out.println("[3] Entrar como convidado. ");
		System.out.println("[4] Sair. ");
		
		key = readerI.nextInt();

		switch (key) {
		case 1:
			
			estabelecimentos.cadastrarEstabelecimento(readerS);
			logado = true;
			login = 1;
			break;
		case 2:
			
			tutores.cadastrarTutor(readerS, readerI);
			logado = true;
			login = 2;
			aguardar();
			
			
			break;
		case 3:
			
			System.out.println("Entrando como convidado...");
			logado = false;
			login = 0;
			aguardar();
			
			break;
		case 4:
			
			System.out.println("Obrigado, volte sempre.");
			key =5;
		
			break;
		default:
			System.out.println("Opção inválida. ");
			aguardar();
			break;
		}

		while (key != 5) {

			System.out.println("=============================================");
			System.out.println("============= SALVA PATAS ===================");
			System.out.println("=============================================");
			System.out.println("          Adote com responsabilidade!	   	 ");
			System.out.println("=============================================");
			System.out.println("======[1]Mostrar Pets para Adoção ===========");
			System.out.println("======[2]Cadastrar Pet ======================");
			System.out.println("======[3]Adotar =============================");
			System.out.println("======[4]Perfil =============================");
			System.out.println("======[5]Saida  =============================");
			if (logado) {
				if(login == 1) {
					System.out.println("====== Perfil logado: " + estabelecimentos.estabLogado.getNome());
					System.out.println("=============================================");
					
				}else {
					System.out.println("====== Perfil logado: " + tutores.tutorLogado.getNome());
					System.out.println("=============================================");
				}
			} else {
				System.out.println("====== Perfil logado: convidado =============");
				System.out.println("=============================================");
			}
			key = readerI.nextInt();

			switch (key) {
			case 1:

				estabelecimentos.estabLogado.mostrarPets();
				aguardar();

				break;
			case 2:
				
				if(login == 1) {
					estabelecimentos.estabLogado.cadastrarPet(readerS, readerI);
					aguardar();	
				}else {
					System.out.println("entre ou cadastre-se como ESTABELECIMENTO para realizar essa funcao. ");
				}
				

				break;
			case 3:

					if (logado ) {
						if(login == 2) {
							if(estabelecimentos.estabLogado.petsCadastrados != null) {
								System.out.println("Sem pets disponiveis para adocao");
							}else {
								tutores.adotarPet(estabelecimentos.estabLogado.serAdotado(readerI));
							}
						}else {
							System.out.println("entre ou cadastre-se como TUTOR para realizar essa funcao. ");
						}
						
					}else {	
						System.out.println("entre ou cadastre-se como TUTOR para realizar essa funcao. ");
					}
			
				aguardar();

				break;
				
			case 4:
				
				 do{
					
					if(logado) {
						System.out.println("=============================================");
						System.out.println("============= " + tutores.tutorLogado.getNome());
					}else {
						System.out.println("=============================================");
						System.out.println("============= perfil do convidado ===========");
					}
					
					System.out.println("=============================================");
					System.out.println("           Bem vindo ao seu perfil	     	 ");
					System.out.println("=============================================");
					System.out.println("======[1]Mostrar seus pets  =================");
					System.out.println("======[2]Mostrar seus dados =================");
					System.out.println("======[3]sair da conta ======================");
					System.out.println("======[4]voltar para o menu principal =======");
					System.out.println("=============================================");
					key = readerI.nextInt();
					
					switch(key) {
					
					case 1: 
						
						tutores.tutorLogado.mostrarPetsFilhos();
						
						break;
					case 2:
						
						tutores.tutorLogado.imprimeDados();
						
						break;
					case 3:
						
						break;
					case 4:
						
						key = 4;
				
						break;
					default:
						
						System.out.println("Opção inválida, tente novamente. ");
						aguardar();
						
						break;
					}
					
				}while(key !=4);
				
				break;
			case 5:

				System.out.println("Obrigado, volte sempre.");
				aguardar();

				break;
			default:

				System.out.println(" Opção inválida.");
				aguardar();

				break;

			}
		}
	}
}

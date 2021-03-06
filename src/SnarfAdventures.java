import java.util.Scanner;

public class SnarfAdventures {

	public static void main(String[] args) {
		
		String nome;
		String escolha;
		Scanner leitor = new Scanner(System.in);
		System.out.println("SNARF ADVENTURES");
		System.out.println("Um jogo de André David");
		
		
		System.out.println("Seu objetivo é enfrentar os perigos para que voce consiga alimentar o FEROZ e TERRÍVEL Snarf. Qual é seu nome, aventureiro?");
		nome = leitor.next();
		
		System.out.println("Voce está pronto para começar? SIM ou NÃO");
		escolha = leitor.next();
		
		if (escolha.equalsIgnoreCase("sim")) {
			//Aqui eu dou sequencia na história na parte do sim
			System.out.println("Voce está em uma sala escura. Não ve nada. Mas tem uma LANTERNA, uma GARRAFA e um BAIXO. Qual objeto deseja usar?");
			escolha = leitor.next();
			if(escolha.equalsIgnoreCase("lanterna")) {
				//Aqui o que acontece se ele escolher lanterna
				System.out.println("Ao acender a lanterna, voce viu um simbolo antigo");
				System.out.println("$$$$$$$$$$$$$$$$$L   .$$$$$$$$$$$$$$$u");
				System.out.println("$$$$$$$$$$$$$$$$$$N.@$$$$$$$$$$$$$$$$ *");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ '>.n=L");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$RR$$$$ 'b\"  9");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$R#\"  .$$$$ @   .*");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$`   .e$$$$$$$P   e\"");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$R#    o$$$$$$$$P   @");
				System.out.println("$$$$$$$$$$$$$$$$$$$P\" .e> 4$\" '$$$$F  .F");
				System.out.println("$$$$$$$$$$$$$$$$$R  .$$$& '$   $$$$  .#>");
				System.out.println("$$$$$$$$$$$$$$$$$b.o$$$$$  $N  \"$$\" .\"'>");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$  $$N  \"` .$ '>");
				System.out.println("$$$$$$$$$$$$$$ \"$$$$$$$$R  $$$&    $$ '>");
				System.out.println("$$$$$$$$$$$$$$  E\"$$P`9$E  $$$$   8$$ '>");
				System.out.println("$$$$$$$$$$$$$$  E  \"  9$F  $$$$k .$$$ '>");
				System.out.println("$$$$$$$$$$$$$$  E     9$N  $$$$$$$$$$ '>");
				System.out.println("$$$$$$$$$$$$$$  E     9$$.u$$$$$$$$$$ '>");
				System.out.println("$$$$$$$$$$$$$$ o\"     9$$$$$$$$$$$$$$ d");
				System.out.println("**************#       ***************\"");
			}else {
				if(escolha.equalsIgnoreCase("garrafa")) {
					//Aqui o que acontece se ele escolher garrafa
					
				}else {
					if(escolha.equalsIgnoreCase("baixo")) {
						//Aqui o que acontece se ele escolher baixo
					}else {
						System.out.println("Que pena. Voce se atrapalhou na hora de escolher e um aventureiro mais bem preparado já conquistou o premio. GAME OVER");
					}
				}
			}
			
			
			
		}else {
			System.out.println("O faminto Snarf não pode esperar a sua coragem surgir. Voce está fora da jogada... GAME OVER");
		}
		

	}

}

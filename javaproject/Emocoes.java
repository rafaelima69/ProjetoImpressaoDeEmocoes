package br.com.genaration.javaproject;

import java.util.Scanner;

public class Emocoes {

	public void emocoes() {
		
		Scanner sc = new Scanner(System.in);
		
		int dia, otimo = 0, bom = 0, ruim = 0, pessimo = 0, emocao, conversa; 	
		int feliz = 0, triste = 0, aflito = 0, ansioso = 0, cont = 0, a =0;
		
		int otimo1[] = new int [7];
		int bom1[] = new int [7];
		int ruim1[] = new int [7];
		int pessimo1[] = new int [7];
		
		int feliz1[] = new int [7];
		int triste1[] = new int [7];
		int aflito1[] = new int [7];
		int ansioso1[] = new int [7];
		
		
		String conversa2;
		
		System.out.println("Agora que j� sabemos um pouco mais sobre voc�, pedimos para que nos indique como est� se sentindo hoje e repita esse processo diariamente.");
		System.out.println();
		
		while(cont < 2) {
			a = cont;
		System.out.println((a+1) + " � dia ");
		System.out.println("Escolha a op��o de como foi o seu dia:\r\n"
				+ "[1] �timo...Super produtivo\r\n"
				+ "[2] Bom...Na medida do poss�vel\r\n"
				+ "[3] Ruim...\r\n"
				+ "[4] P�ssimo... Poderia nem ter levantado da cama\r\n"
				+ "");
		
		dia = sc.nextInt();
		
		switch(dia) {
			case 1: 
				for(int i = 0; i<6; i++) {
				otimo1[i] = 1;
				}
				otimo++;
				cont++;
				break;
			case 2:
				for(int i = 0; i<6; i++) {
					bom1[i] = 1;
					}
				bom++;
				cont++;
				break;
			case 3:
				for(int i = 0; i<6; i++) {
					ruim1[i] = 1;
					}
				ruim++;
				cont++;
				break;
			case 4:
				for(int i = 0; i<6; i++) {
					pessimo1[i] = 1;
					}
				pessimo++;
				cont++;
				break;
		default:
			System.out.println("D�gito inv�lido! Por favor, digite alguma das op��es.");
		}
		System.out.println();
		System.out.println("Qual foi a emo��o que voc� mais sentiu durante o seu dia?\r\n"
				+ "[1] Feliz\r\n"
				+ "[2] Triste\r\n"
				+ "[3] Aflito\r\n"
				+ "[4] Ansioso\r\n"
				+ "");
		
		emocao = sc.nextInt();
		
		switch(emocao) {
			case 1: 
				for(int i = 0; i<6; i++) {
					feliz1[i] = 1;
					}
				feliz++;
				break;
			case 2:
				for(int i = 0; i<6; i++) {
					triste1[i] = 1;
					}
				triste++;
				break;
			case 3:
				for(int i = 0; i<6; i++) {
					aflito1[i] = 1;
					}
				aflito++;
				break;
			case 4:
				for(int i = 0; i<6; i++) {
					ansioso1[i] = 1;
					}
				ansioso++;	
				break;
			default:
				System.out.println("D�gito inv�lido! Por favor, digite uma das op��es.");
	}
		System.out.println();
		System.out.println("Quer conversar?\r\n"
				+ "[1] Sim\r\n"
				+ "[2] N�o\r\n"
				+ "");
		conversa = sc.nextInt();
		switch(conversa) {
			case 1: 
				System.out.println("Estamos aqui para te escutar! Conte-nos como est� sendo o seu dia!");
				conversa2 = sc.next();
				System.out.println("Obrigada por nos contatar e compartilhar sua experi�ncia, sentimentos! Suas respostas est�o em nossos arquivos para acompanhamento.");
				System.out.println();
				System.out.println("Para continuarmos com o seu processo de autoconhecimento aguardamos no pr�ximo dia o registro de suas emo��es. ");
				System.out.println();
				break;
			case 2:
				System.out.println("Obrigada por nos contatar! Seus dados est�o salvos e continuaremos � disposi��o para auxili�-lo.");
				System.out.println();
				System.out.println("Para continuarmos com o seu processo de autoconhecimento aguardamos no pr�ximo dia o registro de suas emo��es. ");
				System.out.println();
				break;
			default:
				System.out.println("D�gito inv�lido! Por favor, digite uma das op��es.");
		}
}
		System.out.println();
		System.out.println("Agora iremos mostrar quantas vezes voc� sentiu as emo��es descritas:");
		//System.out.println();
			System.out.println("Feliz : " + feliz);
			System.out.println("Triste: " + triste);
			System.out.println("Aflito: " + aflito);
			System.out.println("Ansioso: " + ansioso);
	}
}


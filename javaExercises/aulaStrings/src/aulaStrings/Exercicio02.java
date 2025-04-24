package aulaStrings;

import java.util.Random;

public class Exercicio02 {
	
	/*Construa um programa em Java que implemente e utilize as funções recombinacao e mutacao:  
• A função recombinacao recebe como parâmetro 4 Strings (S1, S2, S3 e S4), onde S1 e S2 são as 
Strings representado os indivíduos pais e S3 e S4 devem retornar os dois indivíduos filhos gerados com a 
recombinação de S1 e S2. Ambas as strings devem possuir o mesmo tamanho.  
• A função mutacao recebe como parâmetro uma string S1 e modifica o conteúdo de S1 realizando o 
processo de mutação.  
O seu programa deve ler duas strings S1 e S2 (de mesmo tamanho), fazer a recombinação dos dois indivíduos e 
aplicar uma mutação em um dos indivíduos resultantes. Por último, o programa deve exibir os 4 indivíduos da 
população (S1, S2, S3 e S4). */
	
	public static String recombinacao(String s1, String s2) {
		
		//recebe o tamanho da String e divide por 2 para obter a metade
		int metadeS1 = s1.length()/2;
		int metadeS2 = s2.length()/2;	
		
		//divide as Strings no meio 
		String s1Primeira = s1.substring(0,metadeS1);
		String s1Segunda = s1.substring(metadeS1);
		String s2Primeira = s2.substring(0,metadeS2);
		String s2Segunda = s2.substring(metadeS2);
		
		
		String s3 = s1Primeira.concat(s2Segunda);//S3 vira a primeira parte de s1 com a segunda parte de s2
		
		
		String s4 = s2Primeira.concat(s1Segunda);//S4 vira a primeira parte de s2 com a segunda parte de s1
		
		return "S3 = " + s3 + "\nS4 = " + s4;
	}
	
	public static String mutacao(String s1) {
		int tamanho = s1.length(); //tamanho da String
		
		Random rand = new Random (); //declaração de um Random
		int index = rand.nextInt(tamanho);//uso do Random para definir qual letra será substituida utilizando o tamanho da String como referencia
		int novoChar = rand.nextInt(tamanho); //uso do Random para definir qual letra irá substituir utilizando o tamanho da String como referencia
		
		String s3 = s1.replace(s1.charAt(index), s1.charAt(novoChar)); //troca as letras utilizano os numeros definidos pelo Random
		
		return "S3 = " + s3;
	}
	
	public static void main(String[] args) {
		
		//declaração das Strings
		String s1, s2;
		s1 = "GATO";
		s2 = "FOFA";
		
		System.out.println("S1 padrão = " + s1);
		System.out.println("S2 padrão = " + s2);
		
		System.out.println("\nRecombinação: ");
		
		System.out.println(recombinacao(s1,s2));
		
		System.out.println("\nMutação: ");
		System.out.println(mutacao(s1));
		System.out.println(mutacao(s2));

	}

}

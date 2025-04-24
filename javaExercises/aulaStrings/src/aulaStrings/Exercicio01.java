package aulaStrings;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*1. (1,0) Escreva um programa que, a partir de um nome informado pelo usuário, exiba suas iniciais.
		Exemplos:  
			Maria das Graças Pimenta => MGP 
			João Carlos dos Santos => JCS  
			José da Silva => JS  
			Pedro Pereira Teixeira => PPT*/
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite seu nome completo");
		
		String nome = ler.nextLine();
		
		List<String> preposicoes = List.of("e", "da", "das", "do", "dos", "de"); //list para definir quais palavras serão excluidas
        String iniciais = ""; //variavel para armazenar as iniciais

        for (String palavra : nome.trim().split("\\s+")) { //divide a String em palavras considerando os espaços em branco
        	
        	//se a palavra não for uma preposição irá adicionar a variável "iniciais"
            if (!preposicoes.contains(palavra.toLowerCase())) {
                iniciais += palavra.toUpperCase().charAt(0); //transforma a rimeira letra em maiúsculo
            }
        }

        System.out.println(iniciais);
	}

}

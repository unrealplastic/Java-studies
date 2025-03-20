package javaBas18;
import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		
		System.out.println("Break comum");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		int num = ler.nextInt();
		
		System.out.println("Entre com um limite");
		int max = ler.nextInt();
		
		for(int i =num; i<=max; i++) { 
			System.out.println(i);
			if(i % 7 == 0) {
				System.out.println("Valor de i = " + i);
				break;
			}
		} System.out.println("----------------------------");
		
		/*break com rotulos
		goto - indica que um comando deve ser interrompido
		e executar outro comando depois da interrupção.
		Não é muito utilizado por programadores Java*/
		
		System.out.println("Break com labels");
		for(int i = 0; i<=4; i++) {
			rotulo1:{ 
				rotulo2: {
					rotulo3:{
						if( i == 1) {
							break rotulo1;
						}
						if( i == 2) {
							break rotulo2;
						}
						if( i == 3) {
							break rotulo3;
						}
						System.out.println("Rótulo 3");
					}
					System.out.println("Rótulo 2");
				}
				System.out.println("Rótulo 1");
			}
			System.out.println(i);
		}
		System.out.println("----------------------------");
		
		
		
		/*continue
		 pede para que o loop continue na próxima iteração.
		 Mais usado quando utilizamos fors alinhados.
		 Pode ser utilizado com labels também*/
		
		System.out.println("Continue");
		
		
		System.out.println("Entre com um número");
		num = ler.nextInt();
		
		System.out.println("Entre com um limite");
		max = ler.nextInt();
		
		for(int i =num; i<=max; i++) { 
			if(i % 7 == 0) { //imprime todos que não são multiplos de 7
				continue;
			}
			System.out.println("Valor de i = " + i);
		}
		System.out.println("----------------------------");
		
	}

}

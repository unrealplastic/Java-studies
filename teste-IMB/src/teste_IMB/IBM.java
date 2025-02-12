package teste_IMB;

import java.util.Arrays;

public class IBM {

	public static void main(String[] args) {
		
		//declara os numeros dentro do array
		int [] a = {1,5,7,7};
		int [] b = {0,1,2,3};
		
		
		//define uma variavel para o tamanho que cada array
		int a1 = a.length;
		int b1 = b.length;
		
		//cria uma nova variavel para armazenar o TAMANHO dos arrays a1 e b1
		int c1 = a1+b1;
		
		
		//cria um novo array que tem o mesmo tamanho da variavel c1
		int [] c = new int [c1];

		//copia os elementos de a e b para c
		System.arraycopy(a, 0, c, 0, a1);
		System.arraycopy(b, 0, c, a1, b1);
		
		
		//organizando o novo array
		for(int i=0; i<c.length; i++) { //percorre cada elemento do array
			for(int j=i+1; j<c.length; j++) { //percorre os elementos a frente do elemento atual
				
				//se o elemento atual c[i] for maior que o proximo c[j], troca eles
				if(c[i]>c[j]) {
					int order = c[i];
					c[i] = c[j];
					c[j] = order;
				}
			}
		}
		
		//transforma o array em String e exibe o resultado
		System.out.println("" + Arrays.toString(c));

	}

}

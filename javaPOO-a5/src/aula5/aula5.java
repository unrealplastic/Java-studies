package aula5;

public class aula5 {

	public static void main(String[] args) {
		
		ContaBanco Conta1 = new ContaBanco ();
		Conta1.setNumConta(12345);
		Conta1.setDono("Lis");
		Conta1.abrirConta("Conta Corrente");
		Conta1.fecharConta();
		Conta1.sacar(50);
		Conta1.fecharConta();


		
		
		ContaBanco Conta2 = new ContaBanco();
		Conta2.setNumConta (12346);
		Conta2.setDono("Henrique");
		Conta2.abrirConta("Conta Poupança");
		Conta2.sacar(1000);
		Conta2.depositar(100);
		
		
		
		
		
		
		
		Conta1.atual();
		Conta2.atual();
	}

}

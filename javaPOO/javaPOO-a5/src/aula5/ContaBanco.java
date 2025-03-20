package aula5;

public class ContaBanco {
	
	
	//atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	//
	
	//Metodos personalizados
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		
		if (this.getTipo() == "Conta Corrente") {
			this.setSaldo (50);
		} else if (this.getTipo() == "Conta Poupança") {
			this.setSaldo (150);
		}
		
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada porque ainda há saldo");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada porque está em débito");
		} else {
			this.setStatus(false);
		}
	}
	
	public void depositar(float valor) {
		if (this.getStatus()) {
			this.setSaldo (getSaldo() + valor);
			System.out.println("O depósito no valor de " + valor + " foi realizado com sucesso na conta de " + this.getDono() + "!");
		} else {
			System.out.println("Impossível depositar. Conta inexistente");
		}
	}
	
	public void sacar(float valor) {
		if (this.getStatus()) {
			if (this.saldo >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("O saque no valor de " + valor + " foi realizado com sucesso na conta de " + this.getDono() +"!");
				
			} else {
				System.out.println("Saldo insuficiente para saque na conta de " + this.getDono());
			}
		} else {
			System.out.println("Impossível sacar. Conta inexistente");
		}
	}
	
	public void pagarMensal(float valor) {
		if (this.getTipo() == "Conta Corrente") {
			valor = 12;
		} else if (this.getTipo() == "Conta Poupança") {
			valor = 20;
		}
		
		if(this.getStatus()) {
			if (this.getSaldo() > valor ) {
				this.setSaldo(this.getSaldo() - valor);
			} else {
				System.out.println("Saldo insuficiente");
			}
		} 
		
		else {
			System.out.println("Impossível pagar. Conta inexistente");
		}
	}
	
	//
	
	//Metodos especiais
	
	public ContaBanco() {
		this.setSaldo (0);
		this.setStatus (false);
	}
	
	public void setNumConta (int numConta) {
		this.numConta = numConta;
	}
	
	public int getNumConta () {
		return numConta;
	}
	
	
	public String getTipo () {
		return tipo;
	}
	
	public void setTipo (String tipo) {
		this.tipo = tipo;
	}
	
	public String getDono () {
		return dono;
	}
	
	public void setDono (String dono) {
		this.dono = dono;
	}
	
	public float getSaldo () {
		return saldo;
	}
	
	public void setSaldo (float saldo) {
		this.saldo = saldo;
	}
	
	public boolean getStatus () {
		return status;
	}
	
	public void setStatus (boolean status) {
		this.status = status;
	}
	
	
	public void atual() {
		System.out.println("---------------------------------------");
		System.out.println("Número da conta: " + this.getNumConta());
		System.out.println("Tipo da conta: " + this.getTipo());
		System.out.println("Dono da conta: " + this.getDono());
		System.out.println("Saldo da conta: " + this.getSaldo());
		System.out.println("Status da conta: " + this.getStatus());
	}
	
	
	
	
	
}

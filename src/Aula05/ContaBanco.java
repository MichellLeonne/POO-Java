package Aula05;

public class ContaBanco {
	//Atributos
	public int NumConta;
	protected String Tipo;
	private String Dono;
	private float Saldo;
	private boolean Status;
	//Metodos personalizados
	public void estadoAtual() {
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {		
			this.setSaldo(50);
		} else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}
	public void fecharConta( ) {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada porque ainda tem saldo");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada porque ainda contem saldo");
		} else {
			System.out.println("Conta fechada com sucesso");
		}	
	}
	public void depositar(float v) {
		if (this.getStatus()) {
			//this.saldo = this.saldo + v;  *Trabalahando direto com Atributos
			this.setSaldo(this.getSaldo() + v); //Trabalhando Com metodos especiais
			System.out.println("Deposito realizado na conta de " + this.getDono());
		} else {
			System.out.println("impossivel depositar em uma conta fechada!");
		}
	}
	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v ) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuiciente para saque");
			}
		} else {
			System.out.println("Impossivel sacar de uma conta fechada");
		}
	}
	public void pagarMensal() { 
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP"){
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else {
			System.out.println("Impossivel pagar uma conta fechda!");
		}
	}
	public ContaBanco() {
		
	}
	public void setNumConta(int n) {
		this.NumConta = n;
	}
	public int getNumConta() {
		return this.NumConta;
	}
	public void setTipo(String t) {
		this.Tipo = t;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setDono(String d) {
		this.Dono = d;
	}
	public String getDono() {
		return Dono;
	}
	public void setSaldo(float s) {
		this.Saldo = s;
	}
	public float getSaldo() {
		return Saldo;
	}
	public void setStatus(boolean Status) {
		this.Status = Status;
	}
	public boolean getStatus() {
		return Status;
	}
} 

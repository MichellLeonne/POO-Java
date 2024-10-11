package Aula03;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampar;
	void status( ) {
		System.out.println("uma caneta " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("ponta " + this.ponta);
		System.out.println("carga " + this.carga);
		System.out.println("está tampada?: " + this.tampar);	
	}
	
	protected void rabiscar() {
		if(this.tampar ==  true) {
			System.out.println("ERRO! não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando");
		}
		
	}
	
	public void tampar() {
		this.tampar = true;
	}
	
	public void destampar() {
		this.tampar = false;
	}
	
	
}

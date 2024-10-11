package aula02;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampar;
	void status( ) {
		System.out.println("uma caneta " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("ponta " + this.ponta);
		System.out.println("carga " + this.carga);
		System.out.println("está tampada?: " + this.tampar);	
	}
	
	void rabiscar() {
		if(this.tampar ==  true) {
			System.out.println("ERRO! não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando");
		}
		
	}
	
	void tampar() {
		this.tampar = true;
	}
	
	void destampar() {
		this.tampar = false;
	}
	
	
}

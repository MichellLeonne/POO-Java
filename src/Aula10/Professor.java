package Aula10;

public class Professor extends Pessoa {
	
	private String especialista;
	private float salario;
	
	public void receberAumento(float aum) {
		this.salario += aum;
	}

	public String getEspecialista() {
		return especialista;
	}
	public void setEspecialista(String especialista ) {
		this.especialista = especialista;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
}

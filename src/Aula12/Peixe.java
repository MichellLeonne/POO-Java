package Aula12;

public class Peixe extends Animal {
	private String corEscama;

	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("comendo substancias");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixa não faz som");
	}
	

}

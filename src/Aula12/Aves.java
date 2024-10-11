package Aula12;

public class Aves extends Animal {
	private String corPena;

	@Override
	public void locomover() {
		System.out.println("Voando");		
	}

	@Override
	public void alimentar() {
		System.out.println("Comer Frutas");		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de aves");		
	}
	public void fazerNinho() {
		System.out.println("Construindo ninho");
	}
	
}

package Aula13;

public class cachorro extends Lobo{

	@Override
	public void emitirSom() {
		System.out.println("auauauau");
	}
	public void reagir(String frase) {
		if (frase.equals("Come") || frase.equals("Ola")) {
			System.out.println("abanar e latir");
		} else
			System.out.println("Rosnar");
	}
	public void reagir(int hora, int min) {
		if (hora < 12) {
			System.out.println("Abanar");
		} else if (hora >= 18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e Latir");
		}
	}
	public void reagir(boolean dono) {
		if (dono) {
			System.out.println("Abanar");
		} else {
			System.out.println("Latir");
		}
	}
    public void reagir(float x, int y) {
		if (idade < 5) {
			if(peso < 10) {					
				System.out.println("Abanar");		
			} else {
				System.out.println("Latir");
			}
		} else {
			if (peso < 10) {
				System.out.println("Rosnar");
			} else {
				System.out.println("ignorar");
			
			}

		}
	}
}

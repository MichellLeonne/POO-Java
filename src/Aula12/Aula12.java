package Aula12;

public class Aula12 {

	public static void main(String[] args) {
		
	//	Animal n = new Animal();   -> Animal é metodo abstrato e não pode ser isntanciado
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Aves a = new Aves();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		GoldFish g = new GoldFish();
		Arara e = new Arara();
				
		c.locomover();
		k.locomover();
		j.locomover();
		g.locomover();
		k.emitirSom();
		g.emitirSom();
		t.alimentar();
		
		
		
	}

}

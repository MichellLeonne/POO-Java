package testeRomulo;

public class TestePolimorfismo {
	public TestePolimorfismo() {
		Pai objeto = new Filho();
		objeto.methodo();
		
		Pai pai = new Pai();
		pai.methodo();
		
		Filho filho = new Filho();
		filho.methodo();
		
		Filho f = new Pai(); // -> Proja de certificação! Neste caso vai dar erro de compilação, erro de runtime, vai imprimir Metodo pai ou imprimir  metodo Filho?
		f.methodo();
		
	}	
	public static void main(String[] args) {
		new TestePolimorfismo();
		
	}

}

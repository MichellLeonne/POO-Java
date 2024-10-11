package Aula07;

public class RelacionamentoClasses {

	public static void main(String[] args) {
		Lutador l[] = new Lutador[3];
		
		l[0] = new Lutador("Pretty Boy","França", 31, 1.75f, 68.9f, "Leve", 11, 2, 1 );
		l[1] = new Lutador("Putscipt", "Brasil", 29, 1.68f, 57.8f, "Leve", 14, 2, 3);
		l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, "Pesado", 12, 2, 1);
		
		// l[2].perderLuta();		
		// l[0].apresentar();
		// l[1].apresentar();
		// l[2].apresentar();
		// l[0].status();
		// l[1].status();
		// l[2].status();
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.lutar();
		l[0].status();
		l[1].status();
		
	}

}

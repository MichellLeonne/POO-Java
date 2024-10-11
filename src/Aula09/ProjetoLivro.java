package Aula09;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", 27, "M");
		p[1] = new Pessoa("Maria", 25, "F");
		//p[2] = new Pessoa("Lana", 22, "F");
				
		l[0] = new Livro("Clean Code", "Robert Cecil", 320, p[0]);
		l[1] = new Livro("Java", "Paul", 215, p[1]);
		//l[2] = new Livro("Clean Architecture", "Robert Cecil", 280, p[2]);
		
		l[0].abrir();
		l[0].folhear(150);
		
		System.out.println(l[0].detalhes());
		System.out.println(l[1].detalhes());
		//System.out.println(l[2].detalhes());
	}

}

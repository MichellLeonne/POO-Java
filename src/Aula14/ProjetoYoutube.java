package Aula14;

public class ProjetoYoutube {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		//Pessoa p = new Pessoa("jOAO", 25, "M");
		
		v[0] = new Video("Aulda 1 de POO");
		v[1] = new Video("Aula 12 PHP");
		v[2] = new Video("Aula 10 HTML");
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Joao", 25, "m", "Juba");
		g[1] = new Gafanhoto("Maria", 26, "f", "Mari");
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(g[0], v[2]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(g[0], v[1]);
		vis[0].avaliar(87);
		System.out.println(vis[1].toString());
		
		//System.out.println(v[0].toString());
		//System.out.println(g[0].toString());
	}

}

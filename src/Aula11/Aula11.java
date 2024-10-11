package Aula11;

public class Aula11 {

	public static void main(String[] args) {
		//Pessoa p1 = new Pessoa(); não posso instanciar um objeto de uma classe ABSTRACT
		Visitante v1 = new Visitante();
		Aluno a1 = new Aluno();
		Bolsista b1 = new Bolsista();
		
		v1.setNome("Pedro");
		v1.setIdade(22);
		v1.setSexo("M");
		
		a1.setNome("Maria");
		a1.setIdade(22);
		a1.setSexo("F");
		a1.setCurso("Administração");
		a1.setMatricula(12345);
		b1.setMatricula(1234);
		b1.setCurso("Arquitetura");
		b1.setNome("Ana");
		b1.setBolsa(12.5f);
		
		a1.pagarMensalidade();
		b1.pagarMensalidade();
		

	}

}

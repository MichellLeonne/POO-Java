package Aula10;

public class Herança {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("João");
		p4.setNome("Carla");
		
		p1.setIdade(25);
		p2.setIdade(30);
		p3.setIdade(15);
		p4.setIdade(18);
		
		p1.setSexo("M");
		p2.setSexo("F");
		p3.setSexo("M");
		p4.setSexo("M");
			
		p2.setCurso("Administração");
		p3.setSalario(2.500f);
	    p4.setSetor("Estoque");
	    p3.receberAumento(550.20f);
	    p2.cancelarMatriculo();
	    	    		
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
		
	}
}
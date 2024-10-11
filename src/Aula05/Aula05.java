package Aula05;

public class Aula05 {

	public static void main(String[] args) {
	
		ContaBanco p1 = new ContaBanco();
		ContaBanco p2 = new ContaBanco();
		
		p1.setNumConta(123);
		p1.setDono("João");
		p1.abrirConta("CC");
				
		p2.setNumConta(111);
		p2.setDono("Maria");
		p2.abrirConta("CP");
				
		p1.depositar(500);
		p2.depositar(500);
		p2.sacar(650);
		
		p2.fecharConta();
		
		p1.estadoAtual();
		p2.estadoAtual();
		
	}

}

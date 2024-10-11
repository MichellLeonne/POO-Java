package Aula10;

public class Aluno extends Pessoa {
	//Atributos
	private int matricula;
	private String curso;
	
	public void cancelarMatriculo() {
		System.out.println("Matricula sera cancelada");
	}
	//Getters and Setters
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}		
}

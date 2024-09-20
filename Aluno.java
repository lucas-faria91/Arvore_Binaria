package pkgArvoreBinaria;

public class Aluno {

	int RA;
	String nome;
	
	public Aluno(int RA, String nome) {
		this.RA = RA;
		this.nome = nome;
	}
	
	public String toString() {
		return RA + " - " + nome;
	}
}

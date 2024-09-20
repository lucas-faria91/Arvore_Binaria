package pkgArvoreBinaria;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hash h = new Hash();
		
		h.inserir(new Aluno(150, "Lucas"));
		h.inserir(new Aluno(100, "Fernando"));
		h.inserir(new Aluno(50, "Caio"));
		h.inserir(new Aluno(120, "Carlos"));
		h.inserir(new Aluno(130, "Pedro"));
		h.inserir(new Aluno(250, "Maria"));
		h.inserir(new Aluno(220, "Ana"));
		h.inserir(new Aluno(300, "Julia"));
		
		System.out.println("Imprimindo a tabela...");
		h.imprimir();
		
		System.err.println();
		
		h.buscar("Caio");
		
		
		
	}

}

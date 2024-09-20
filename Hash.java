package pkgArvoreBinaria;

public class Hash {

	private Arvore tabela[] = new Arvore[26];

	private int funcaoHash(String nome) {
		return nome.toLowerCase().charAt(0) - 97;
	}

	public void inserir(Aluno aluno) {
		int pos = funcaoHash(aluno.nome);

		if (tabela[pos] == null)
			tabela[pos] = new Arvore();

		tabela[pos].inserir(aluno);
	}

	public void imprimir() {
		for (int i = 0; i < tabela.length; i++) {
			if (tabela[i] != null) {
				System.out.println("\n[" + (char) (i + 65) + "]");
				tabela[i].emOrdem();
			}
		}
	}

	public void buscar(String nome) {
		int pos = funcaoHash(nome);
		if (tabela[pos] != null) {
			TipoNo no = tabela[pos].pesquisaArvore(nome);
			if (no == null) {
				System.out.println("Não encontrado!");
			} else
				System.out.println("Nome encontrado na posição: " + pos + " - " + no);
		}
		else
			System.out.println("Não encontrado!");
	}
}
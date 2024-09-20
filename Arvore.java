package pkgArvoreBinaria;

public class Arvore {

	TipoNo raiz;

	public Arvore() {
		raiz = null;
	}

	void emOrdem() {
		caminharEmOrdem(raiz);
	}

	void preOrdem() {
		caminharEmPreOrdem(raiz);
	}

	void posOrdem() {
		caminharEmPosOrdem(raiz);
	}

	private void caminharEmPreOrdem(TipoNo no) {
		if (no != null) {
			System.out.print(no);
			caminharEmPreOrdem(no.esq);
			caminharEmPreOrdem(no.dir);
		}
	}

	private void caminharEmPosOrdem(TipoNo no) {
		if (no != null) {
			caminharEmPosOrdem(no.esq);
			caminharEmPosOrdem(no.dir);
			System.out.print(no);
		}
	}

	private void caminharEmOrdem(TipoNo no) {
		if (no != null) {
			caminharEmOrdem(no.esq);
			System.out.print(no);
			caminharEmOrdem(no.dir);
		}
	}
	
	private TipoNo pesquisa(String chave, TipoNo no) {
		if (no == null) {
		return null;
		} else if (chave.compareToIgnoreCase(no.a.nome) < 0) {
			return pesquisa(chave, no.esq);
		} else if (chave.compareToIgnoreCase(no.a.nome) > 0) {
			return pesquisa(chave, no.dir);
		} return no;
	}
	
	TipoNo pesquisaArvore(String chave) {
		return pesquisa(chave, raiz);
	}

	public void inserir(Aluno a) {
		TipoNo no = new TipoNo(a);

		if (raiz == null)
			raiz = no;
		else {
			TipoNo aux;
			TipoNo ant;
			aux = raiz;
			ant = null;

			while (aux != null) {
				ant = aux;

				if (aux.a.nome.compareToIgnoreCase(a.nome) == 0) {
					System.out.println("Dado inserido já existente");
					return;
				}
				if (a.nome.compareToIgnoreCase(aux.a.nome) > 0)
					aux = aux.dir;
				else
					aux = aux.esq;
			}

			if (ant.a.nome.compareToIgnoreCase(a.nome) < 0)
				ant.dir = no;
			else
				ant.esq = no;
		}
	}
}

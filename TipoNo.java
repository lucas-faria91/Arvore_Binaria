package pkgArvoreBinaria;

public class TipoNo {
	
	Aluno a;
	TipoNo esq, dir;
	
	
	public TipoNo(Aluno a) {
		this.a = a;
		esq = dir = null;
	}

	public String toString() {
		return "->" + a;
	}
}

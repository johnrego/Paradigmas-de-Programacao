public class LivroDeBiblioteca{
	String nome, autor, editora;
	int ano, qnt;
	void cadastra(String n, String a, String e, int an, int q){
		nome = n;
		autor = a;
		editora = e;
		ano = an;
		qnt = q;
	}
	void empresta(String n){
		if (qnt > 0){
			qnt -= 1;
			System.out.println("Livro emprestado")
		}
		else{
			System.out.println("Livro nao disponivel")
		}
	}
	void devolve(String n){
		qnt += 1;
		System.out.println("Livro devolvido")
	}

}
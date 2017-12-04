public class Contador{
	String nomeItem;
	private int qnt;
	void zera(){
		qnt = 0;
	}
	void incrementa(int inc){
		qnt += inc;
	}
	void mostra(){
		System.out.println(qnt);
	}
}
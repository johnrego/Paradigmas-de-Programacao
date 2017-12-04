public class ContaBancariaSimples{
	String nomeDoCorrentista;
	Double saldo;
	Boolean contaEspecial;
	void abreConta(String nome, Double deposito, Boolean especial){
		nomeDoCorrentista = nome;
		if (deposito < 0){
			saldo = 0.0;
		}
		else{
			saldo = deposito;
		}
		contaEspecial = especial;
	}
	void abreContaSimples(String nome){
		nomeDoCorrentista = nome;
		saldo = 0.0;
		contaEspecial = false;
	}
	void deposita(Double valor){
		saldo += valor;
	}
	void retira(Double valor){
		if (!contaEspecial){
			if (valor <= saldo){
				saldo -= valor;
			}
		}
		else{
			saldo -= valor;
		}
	}
}
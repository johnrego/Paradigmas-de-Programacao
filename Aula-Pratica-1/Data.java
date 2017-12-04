public class Data{
	byte dia, mes;
	short ano;
	void inicializa(byte d, byte m, short a){
		if (valida(d, m, a)){
			dia = d;
			mes = m;
			ano = a;
		}
		else{
			dia = 0;
			mes = 0;
			ano = 0;
		}
	}
	boolean valida(byte d, byte m, short a){
		if ((d>0)&&(d<32)&&(m>0)&&(m<13)){
			return true;
		}
		else{
			return false;
		}
	}
	boolean igual(Data d){
		if ((dia == d.dia)&&(mes == d.mes)&&(ano == d.ano)){
			return true;
		}
		else{
			return false;
		}
	}
	void mostra(){
		System.out.print(dia);
		System.out.print("/");
		System.out.print(mes);
		System.out.print("/");
		System.out.println(ano);
	}
	Data duplicaData(Data d){
		return d;
	}
	boolean vemAntes(Data d){
		if (ano < d.ano){
			return true;
		}
		if (ano > d.ano){
			return false;
		}
		if ((ano == d.ano)&&(mes < d.mes)){
			return true;
		}
		if ((ano == d.ano)&&(mes > d.mes)){
			return false;
		}
		if((ano == d.ano)&&(mes == d.mes)&&(dia < d.dia)){
			return true;
		}
		if((ano == d.ano)&&(mes == d.mes)&&(dia > d.dia)){
			return false;
		}
		else{
			return true;
		}
	}
}
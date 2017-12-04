public class Ex{
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.inicializa((byte)11, (byte)4, (short)1994);
		d1.mostra();
		Data d2 = d1.duplicaData(d1);
		d2.mostra();
		Data d3 = new Data();
		d3.inicializa((byte)10, (byte)4, (short)1994);
		System.out.println(d1.igual(d3));
		System.out.println(d1.vemAntes(d3));
	}
}
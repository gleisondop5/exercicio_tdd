package boleto;

public class Boleto {
	
	private long codigo;
	private String date;
	private double valor;
	
	public Boleto(long codigo, String data, double valor) {
		super();
		this.codigo = codigo;
		this.date = date;
		this.valor = valor;
	}
	
	public long getCodigo() {
		return codigo;
	}
	
	public String getDate() {
		return date;
	}
	
	public double getValor() {
		return valor;
	}

}

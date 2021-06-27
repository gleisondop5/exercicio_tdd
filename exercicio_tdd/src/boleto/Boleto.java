package boleto;

public class Boleto {
	
	private long codigo;
	private String data;
	private double valor;
	
	public Boleto(long codigo, String data, double valor) {
		super();
		this.codigo = codigo;
		this.data = data;
		this.valor = valor;
	}
	
	public long getCodigo() {
		return codigo;
	}
	
	public String getData() {
		return data;
	}
	
	public double getValor() {
		return valor;
	}

}

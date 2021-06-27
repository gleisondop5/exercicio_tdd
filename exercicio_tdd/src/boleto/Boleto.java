package boleto;

public class Boleto {
	
	private long codigo;
	private String data;
	
	public Boleto(long codigo, String data) {
		super();
		this.codigo = codigo;
		this.data = data;
	}
	
	public long getCodigo() {
		return codigo;
	}
	
	public String getData() {
		return data;
	}

}

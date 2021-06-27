package fatura;

public class Fatura {
	
	private String date;
	private double valorTotal;
	
	public Fatura(String date, double valorTotal) {
		super();
		this.date = date;
		this.valorTotal = valorTotal;
	}
	
	public String getDate() {
		return date;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}

}

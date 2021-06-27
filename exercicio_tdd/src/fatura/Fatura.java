package fatura;

public class Fatura {
	
	private String date;
	private double valorTotal;
	private String nome;
	
	public Fatura(String date, double valorTotal, String nome) {
		super();
		this.date = date;
		this.valorTotal = valorTotal;
		this.nome = nome;
	}
	
	public String getDate() {
		return date;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public String getNome() {
		return nome;
	}
}

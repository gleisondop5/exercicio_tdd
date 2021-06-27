package processador;

import java.util.ArrayList;

import boleto.Boleto;

public class Processador {
	
	private ArrayList boletoList;
	
	public Processador() {
		boletoList = new ArrayList();
	}

	public int getQtdBoletos() {
		return boletoList.size();
	}
	
	public void addBoleto(Boleto boleto) {
		boletoList.add(boleto);
	}
}

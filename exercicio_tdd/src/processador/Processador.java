package processador;

import java.util.ArrayList;
import java.util.Iterator;

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
	
	public double getGetVTptalBoletos() {
		double valorTotal = 0.0;		
		for (Iterator i = boletoList.iterator(); i.hasNext();) {
			Boleto item = (Boleto) i.next();
			valorTotal += item.getValor();
		}		
		return valorTotal;
	}
}

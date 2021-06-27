package processador;

import java.util.ArrayList;

public class Processador {
	
	private ArrayList boletoList;
	
	public Processador() {
		boletoList = new ArrayList();
	}

	public int getQtdBoletos() {
		return boletoList.size();
	}
}

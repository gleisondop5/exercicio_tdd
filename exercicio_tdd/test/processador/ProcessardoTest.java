package processador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import boleto.Boleto;

public class ProcessardoTest {
	
	Processador processador;
	private ArrayList boletosList;
	Boleto luz = new Boleto(928374658, "01/07/2021", 240.00);
	Boleto telefone = new Boleto(928374658, "01/07/2021", 240.00);
	Boleto agua = new Boleto(928374658, "01/07/2021", 240.00);
	Boleto internet = new Boleto(928374658, "01/07/2021", 240.00);
	
	
	@BeforeEach
	public void inicializa() {
		processador = new Processador();
		boletosList = new ArrayList();
		processador.addBoleto(luz);
		boletosList.add(luz);
		processador.addBoleto(telefone);
		boletosList.add(telefone);
		processador.addBoleto(agua);
		boletosList.add(agua);		
	}

	
	@Test
	@DisplayName("Testa quantidade de boletos no processador")
	public void testQtdBoletos() {
		int qtdBoletos = processador.getQtdBoletos();	
		int qtdItens = boletosList.size();
		assertEquals(qtdItens, qtdBoletos);		
	}
	
	@Test
	@DisplayName("Testa adicionar boletos no processador")
	public void testAddBoletos() {
		int qtdAntes = processador.getQtdBoletos();
		processador.addBoleto(internet);	
		int qtdDepois = processador.getQtdBoletos();
		assertEquals(qtdAntes, qtdDepois - 1);	
	}
	
	@Test
	@DisplayName("Testa valor total dos boletos no processador")
	public void testGetVTotalBoletos() {
		double VTotalBoletos = processador.getGetVTptalBoletos();
		int tamanho = boletosList.size();
		double vTotal = 0;
		for (int i = 0; i < tamanho; i++) {
			Boleto item = (Boleto) boletosList.get(i);
			vTotal += item.getValor();
		}		
		assertEquals(vTotal, VTotalBoletos);	
	}
}

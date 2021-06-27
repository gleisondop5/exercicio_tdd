package processador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import boleto.Boleto;

public class ProcessardoTest {
	
	Processador processador;
	private ArrayList items;
	Boleto luz = new Boleto(928374658, "01/07/2021", 240.00);
	
	
	@BeforeEach
	public void inicializa() {
		processador = new Processador();
		items = new ArrayList();
		
	}

	@DisplayName("Testa quantidade de boletos no processador")
	@Test
	public void testQtdBoletos() {
		int qtdBoletos = processador.getQtdBoletos();	
		int qtdItens = items.size();
		assertEquals(qtdItens, qtdBoletos);		
	}
	
	@DisplayName("Testa adicionar boletos no processador")
	@Test
	public void testAddBoletos() {
		int qtdAntes = processador.getQtdBoletos();
		processador.addBoleto(luz);	
		int qtdDepois = processador.getQtdBoletos();
		assertEquals(qtdAntes, qtdDepois - 1);	
	}
}

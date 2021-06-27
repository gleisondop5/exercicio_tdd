package fatura;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class FaturaTest {
	
	private Fatura fatura;
	
	@BeforeEach
	public void inicializa() {
		fatura = new Fatura("26/06/2021", 1500.00, "João Batista");
	}
	
	@Test
	@DisplayName("Testa se a fatura possui uma data")
	public void testData() {
		String date = fatura.getDate();		
		assertNotNull(date);		
	}
	
	@Test
	@DisplayName("Testa se a fatura possui um valor total")
	public void testValorTotal() {
		double valorTotal = fatura.getValorTotal();		
		assertNotNull(valorTotal);		
	}

	@Test
	@DisplayName("Testa se a fatura possui um nome")
	public void testNome() {
		String nome = fatura.getNome();		
		assertNotNull(nome);		
	}
}

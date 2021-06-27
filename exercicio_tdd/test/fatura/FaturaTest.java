package fatura;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class FaturaTest {
	
	private Fatura fatura;
	
	@BeforeEach
	public void inicializa() {
		fatura = new Fatura("26/06/2021");
	}
	
	@Test
	@DisplayName("Testa se o boleto possui uma data")
	public void testData() {
		String date = fatura.getDate();		
		assertNotNull(date);		
	}

}

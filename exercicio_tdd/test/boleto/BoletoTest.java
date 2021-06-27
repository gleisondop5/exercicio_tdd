package boleto;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class BoletoTest {
	
	private Boleto boleto;
	
	@BeforeEach
	public void inicializa() {
		boleto = new Boleto(123456789, "26/06/2021", 100.00);
	}
	
	@Test
	@DisplayName("Testa se o boleto possui um código")
	public void testCodigo() {
		long codigo = boleto.getCodigo();		
		assertNotNull(codigo);		
	}
	
	@Test
	@DisplayName("Testa se o boleto possui uma data")
	public void testData() {
		String date = boleto.getDate();		
		assertNotNull(date);		
	}
	
	@Test
	@DisplayName("Testa se o boleto possui um valor")
	public void testValor() {
		double valor = boleto.getValor();		
		assertNotNull(valor);		
	}
	
	@Test
	@DisplayName("Testa se o valor do boleto é valido")
	public void testValidadeValor() {
		double valor = boleto.getValor();		
		assertTrue(valor >= 0);		
	}
	
	

}

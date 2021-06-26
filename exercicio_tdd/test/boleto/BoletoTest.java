package boleto;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class BoletoTest {
	
	private Boleto boleto;
	
	@BeforeEach
	public void inicializa() {
		boleto = new Boleto(123456789);
	}
	
	@Test
	@DisplayName("Testa se o boleto possui um código")
	public void testCodigo() {
		long codigo = boleto.getCodigo();		
		assertNotNull(codigo);		
	}

}

package aula;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class SenaTest {

	@Mock
	private Sena sena = null;

	@Before
	public void setUp() throws Exception {
		sena = Mockito.mock(Sena.class);
		int[] a2 = {1,2,3,4,5,6};
		Mockito.when(sena.create(6)).thenReturn(a2);
		int[] a3 = {1,2,3,4,5,6,7,8,9,10,11,12};
		Mockito.when(sena.create(12)).thenReturn(a3);
	}

	@Test(expected = Exception.class)
	public void testa1() {
		Mockito.doThrow(new Exception("Teste de exceção")).when(sena).create(5); 
		assertNotNull(sena);		
	}
		
	@Test
	public void testa2() {		
	}
	
	@Test
	public void testa3() {	
	}
	
	@Test(expected = Exception.class)
	public void testa4() {
		Mockito.doThrow(new Exception("Teste de exceção")).when(sena).create(13); 
		assertNotNull(sena);	
	}
}

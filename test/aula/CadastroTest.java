package aula;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class CadastroTest {

	@Mock
	private Cadastro cadastro = null;

	@Before
	public void setUp() throws Exception {
		cadastro = Mockito.mock(Cadastro.class);
		Mockito.when(cadastro.insert(1, "De volta para o futuro I")).thenReturn(true);
		Mockito.when(cadastro.insert(2, null)).thenReturn(false);
		Mockito.when(cadastro.insert(3, "")).thenReturn(false);
	}

	@Test
	public void testa1() throws IOException {
		assertTrue(cadastro.insert(1, "De volta para o futuro I"));
	}

	@Test
	public void testa2() throws IOException {
		assertFalse(cadastro.insert(2, null));
	}

	@Test
	public void testa3() throws IOException {
		assertFalse(cadastro.insert(3, ""));
	}

	@Ignore
	@Test(expected = Exception.class)
	public void testb() throws IOException {
		Mockito.doThrow(new RuntimeException()).when(cadastro).imprimir();
	}
}

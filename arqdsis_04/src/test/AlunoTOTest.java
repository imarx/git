package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import to.AlunoTO;

public class AlunoTOTest {
	AlunoTO to;
	@Before
	public void setUp() throws Exception {
		to = new AlunoTO();
		to.setFone("123456789");
      to.setEmail("samsahsa");
      to.setComplemento("asadasd");
      to.setNumero(0);
      to.setEndereco("dsdhid");
      to.setRG("123456789");
      to.setCPF("123456789");
      to.setDataNascimento("31/02/96");
      to.setSexo("masc");
		to.setNome("Arthur");
		to.setCodigo(3);
	}

	@Test
	public void testGets() {
		assertEquals("getNome", to.getNome(), "Arthur");
      assertEquals("getSexo", to.getSexo(), "masc");
      assertEquals("getDataNascimento", to.getDataNascimento(), "31/02/96");
		assertEquals("getCPF", to.getCPF(), "123456789");
      assertEquals("getRG", to.getRG(), "123456789");
      assertEquals("getEndereco", to.getEndereco(), "sasasa");
      assertEquals("getNumero", to.getNumero(), 0);
      assertEquals("getComplemento", to.getComplemento(), "huisdhdh");
      assertEquals("getEmail", to.getEmail(), "lkdsfddjk");
      assertEquals("getFone", to.getFone(), "123456789");
		assertEquals("getCodigo", to.getCodigo(), 3);
	}
	
	@Test
	public void testEquals(){
		AlunoTO copia = new AlunoTO();
		copia.setFone(to.getFone());
      copia.setEmail(to.getEmail());
      copia.setComplemento(to.getComplemento());
      copia.setNumero(to.getNumero());
      copia.setEndereco(to.getEndereco());
      copia.setRG(to.getRG());
      copia.setCPF(to.getCPF());
      copia.setDataNascimento(to.getDataNascimento());
      copia.setSexo(to.getSexo());
		copia.setNome(to.getNome());
		copia.setCodigo(to.getCodigo());
		assertEquals("teste to igual a copia", to, copia);
	}

}
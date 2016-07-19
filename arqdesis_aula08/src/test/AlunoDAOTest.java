package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import to.AlunoTO;
import dao.AlunoDAO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AlunoDAOTest {
	AlunoDAO dao;
	AlunoTO to;
	
	@Before
	public void setUp() throws Exception {
		dao = new AlunoDAO();
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
	public void test00Carregar() {
		AlunoTO fixture = new AlunoTO();
		fixture.setFone("fone1");
		fixture.setEmail("email1");
		fixture.setComplemento("complemento'");
		fixture.setNumero(1);
		fixture.setEndereco("endereco1");
		fixture.setRG("rg1");
		fixture.setCPF("cpf1");
		fixture.setDataNascimento("datanasc1");
		fixture.setSexo("sexo1");
		fixture.setNome("nome1");
		fixture.setCodigo(1);	
     	AlunoTO novo = dao.carregar(1);
		novo.setCodigo(1);
		assertEquals("testa carregamento", novo, fixture);
	}

	@Test
	public void test01Incluir() {
		dao.incluir(to);
		AlunoTO novo = dao.carregar(to.getCodigo());
		novo.setCodigo(to.getCodigo());
		assertEquals("testa inclusao", novo, to);
	}
	
	@Test
	public void test02Alterar() {
		to.setFone("4545645");
		dao.alterar (to);
		AlunoTO novo = dao.carregar(to.getCodigo());
		novo.setCodigo(to.getCodigo());
		assertEquals("testa altera��o", novo, to);
	}
	
	@Test
	public void test03Deletar() {
		to.setNome(null);
		to.setSexo(null);
		to.setDataNascimento(null);
		to.setCPF(null);
		to.setRG(null);
		to.setEndereco(null);
		to.setNumero(0);
		to.setComplemento(null);
		to.setEmail(null);
		to.setFone(null);
		dao.deletar(to);
		AlunoTO novo = dao.carregar(to.getCodigo());
		novo.setCodigo(to.getCodigo());
		assertEquals("testa exclusao", novo, to);
	}
}

package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import to.CursoTO;
import dao.CursoDAO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CursoDAOTest {
	CursoDAO dao;
	CursoTO to;


	@Before
	public void setUp() throws Exception {
		dao = new CursoDAO();
		to = new CursoTO();
		to.setDescricao("lkajshjas");
		to.setLivros("sdds");
      to.setSoftwares("sas");
      to.setTipoLab("dsds");
      to.setValor(0);
      to.setNumeroDeVagas(0);
      to.setHorario("1212");
      to.setDataDeTermino("32/32/32");
      to.setDataDeInicio("31/02/96");
      to.setTipo("info");
		to.setNome("Curso");
		to.setCodigo(3);
	}
	
	@Test
	public void test00Carregar() {
		CursoTO fixture = new CursoTO();
		fixture.setDescricao("descricao1");
		fixture.setLivros("licros1");
      fixture.setSoftwares("software1");
      fixture.setTipoLab("tipolab1");
      fixture.setValor(1);
      fixture.setNumeroDeVagas(1);
      fixture.setHorario("horario1");
      fixture.setDataDeTermino("dataTermino1");
      fixture.setDataDeInicio("dataInicio1");
      fixture.setTipo("tipo1");
		fixture.setNome("nome1");
		fixture.setCodigo(1);
		CursoTO novo = dao.carregar(1);
		novo.setCodigo(1);
		assertEquals("testa carregamento", novo, fixture);
	}

	@Test
	public void test01Incluir() {
		dao.incluir(to);
		CursoTO novo = dao.carregar(to.getCodigo());
		novo.setCodigo(to.getCodigo());
		assertEquals("testa inclusao", novo, to);
	}
	
	@Test
	public void test02Alterar() {
		to.setTipo("arte");
		dao.alterar(to);
		CursoTO novo = dao.carregar(to.getCodigo());
		novo.setCodigo(to.getCodigo());
		assertEquals("testa alteração", novo, to);
	}
	
	@Test
	public void test03Deletar() {
		to.setNome(null);
      to.setTipo(null);
      to.setDataDeInicio(null);
      to.setDataDeTermino(null);
      to.setHorario(null);
      to.setNumeroDeVagas(null);
      to.setValor(null);
      to.setTipoLab(null);
      to.setSoftwares(null);
      to.setLivros(null);
      to.setDescricao(null);
		dao.deletar(to);
		CursoTO novo = dao.carregar(to.getCodigo());
		novo.setCodigo(to.getCodigo());
		assertEquals("testa Exclusao", novo, to);
	}
}

package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import to.CursoTO;

public class CursoTOTest {
	CursoTO to;
	@Before
	public void setUp() throws Exception {
		to = new CursoTO();
      to.setDescricaoMaterial("lkajshjas");
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

	@SuppressWarnings("deprecation")
	@Test
	public void testGets() {
		assertEquals("getNome", to.getNome(), "Cursp");
      assertEquals("getTipo", to.getTipo(), "info");
      assertEquals("getDataDeInicio", to.getDataDeInicio(), "31/02/96");
		assertEquals("getDataDeTermino", to.getDataDeTermino(), "31/02/96");
      assertEquals("getHorario", to.getHorario(), "1212");
      assertEquals("getNumeroDeVagas", to.getNumeroDeVagas(), 0);
      assertEquals("getValor", to.getValor(), 0);
      assertEquals("getTipoLab", to.getTipoLab(), "sas");
      assertEquals("getSoftwares", to.getSoftwares(), "dsds");
      assertEquals("getLivros", to.getLivros(), "dsds");
      assertEquals("getDescricao", to.getDescricaoMaterial(), "ffgfgf");
		assertEquals("getCodigo", to.getCodigo(), 3);
	}
	
	@Test
	public void testEquals(){
		CursoTO copia = new CursoTO();
      copia.setDescricaoMaterial(to.getDescricaoMaterial());
		copia.setLivros(to.getLivros());
      copia.setSoftwares(to.getSoftwares());
      copia.setTipoLab(to.getTipoLab());
      copia.setValor(to.getValor());
      copia.setNumeroDeVagas(to.getNumeroDeVagas());
      copia.setHorario(to.getHorario());
      copia.setDataDeTermino(to.getDataDeTermino());
      copia.setDataDeInicio(to.getDataDeInicio());
      copia.setTipo(to.getTipo());
		copia.setNome(to.getNome());
		copia.setCodigo(to.getCodigo());
		assertEquals("teste to igual a copia", to, copia);
	}

}
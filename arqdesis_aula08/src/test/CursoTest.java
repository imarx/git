package test;

import static org.junit.Assert.assertEquals;
import model.Curso;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CursoTest {
   Curso curso, copia;

   @Before
   public void setUp() throws Exception {
      curso = new Curso(1, "Mat","exat", "31/03/15", "31/03/17","20:00" , 5, 40, "as", "alguns", "muitos", "asasasa");
      copia = new Curso(1, "Mat","exat", "31/03/15", "31/03/17","20:00" , 5, 40, "as", "alguns", "muitos", "asasasa");
   }
	
   @Test
   public void test00Consultar() {
      Curso fixture = new Curso(1, "nome1","tipo1", "dataDeInicio1", "dataDeTermino1","horario1" , 1, 1, "tipoLab1", "softwares1", "livros1", "descricaoMaterial1");
      Curso novo = new Curso(1, null,null,null, null,null , 0, 0, null, null, null, null);
      novo.carregar();
      assertEquals("testa inclusao", novo, fixture);
   }

   @Test
   public void test01Incluir() {
      curso.criar();
      curso.carregar();
      assertEquals("testa criacao", curso, copia);
   }

   @Test
   public void test02Alterar() {
      curso.setNome("Matematica");
      copia.setNome("matematica");		
      curso.atualizar();
      assertEquals("testa inclusao", curso, copia);
   }

   @Test
   public void test03Deletar() {
      curso.setNome(null);
      curso.setTipo(null);
      curso.setDataDeInicio(null);
      curso.setDataDeTermino(null);
      curso.setHorario(null);
      curso.setNumeroDeVagas(0);
      curso.setValor(0);
      curso.setTipoLab(null);
      curso.setSoftwares(null);
      curso.setLivros(null);
      curso.setDescricao(null);
      //Copia
      copia.setNome(null);
      copia.setTipo(null);
      copia.setDataDeInicio(null);
      copia.setDataDeTermino(null);
      copia.setHorario(null);
      copia.setNumeroDeVagas(0);
      copia.setValor(0);
      copia.setTipoLab(null);
      copia.setSoftwares(null);
      copia.setLivros(null);
      copia.setDescricao(null);     
      curso.excluir();
      assertEquals("testa inclusao", curso, copia);
   }
}

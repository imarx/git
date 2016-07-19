package test;

import static org.junit.Assert.assertEquals;
import model.Aluno;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AlunoTest {
   Aluno aluno, copia;

   @Before
   public void setUp() throws Exception {
      aluno = new Aluno(1, "Arthur","masc", "31/03/96", "rua flores",2 , "asas", "123456789", "5221111129", "45698723102", "aoaoa@sas" );
      copia = new Aluno(1, "Arthur","masc", "31/03/96", "rua flores",2 , "asas", "123456789", "5221111129", "45698723102", "aoaoa@sas" );
   }
	
   @Test
   public void test00Consultar() {
      Aluno fixture = new Aluno(1, "nome1","sexo1", "datanasc1", "endereco1", 1 , "complemento1", "fone1", "rg1", "cpf1", "email1" );
      Aluno novo = new Aluno(1, "nome1","sexo1", "datanasc1", "endereco1", 1 , "complemento1", "fone1", "rg1", "cpf1", "email1");
      novo.carregar();
      assertEquals("testa inclusao", novo, fixture);
   }

   @Test
   public void test01Incluir() {
      aluno.incluir();
      aluno.carregar();
      assertEquals("testa criacao", aluno, copia);
   }

   @Test
   public void test02Alterar() {
      aluno.setFone("999999");
      copia.setFone("999999");		
      aluno.alterar();
      assertEquals("testa inclusao", aluno, copia);
   }

   @Test
   public void test03Deletar() {
      aluno.setNome(null);
      aluno.setSexo(null);
      aluno.setDataNascimento(null);
      aluno.setCPF(null);
      aluno.setRG(null);
      aluno.setEndereco(null);
      aluno.setNumero(0);
      aluno.setComplemento(null);
      aluno.setEmail(null);
      aluno.setFone(null);
      //Copia
      copia.setNome(null);
      copia.setSexo(null);
      copia.setDataNascimento(null);
      copia.setCPF(null);
      copia.setRG(null);
      copia.setEndereco(null);
      copia.setNumero(0);
      copia.setComplemento(null);
      copia.setEmail(null);
      copia.setFone(null);
      aluno.deletar();
      assertEquals("testa inclusao", aluno, copia);
   }
}

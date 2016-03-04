package manterCurso2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import arqdesis_aula02b.ClienteDAO;
import arqdesis_aula02b.ClienteTO;

public class Curso {
	private int codigo, numeroDeVagas;
	private String nome, tipo, dataDeInicio, dataDeTermino, horario, tipoLab, softwares, livros, descricaoMaterial;
	private double valor;
	   	      
	public Curso(int Codigo, String nome, String tipo, String dataDeInicio, String dataDeTermino, String horario, double valor, int numeroDeVagas, String tipoLab, String softwares, String livros, String descricao){  
	      this.codigo = codigo;
	      this.nome = nome;
	      this.tipo = tipo;
	      this.dataDeInicio = dataDeInicio;
	      this.dataDeTermino = dataDeTermino;
	      this.horario = horario;
	      this.valor = valor;
	      this.numeroDeVagas = numeroDeVagas;
	      this.tipoLab = tipoLab;
	      this.softwares = softwares;
	      this.livros = livros;
	      this.descricaoMaterial = descricaoMaterial;
	   }
	
	public int getCodigo(){
		   
	      return codigo;   
	   }
	   
	   public String getNome(){
	      
	      return nome;    
	   }
	   
	   public String getTipo(){
	   
	      return tipo;
	   }
	   
	   public String getDataDeInicio(){
	   
	      return dataDeInicio;
	   }
	   
	   public String getDataDeTermino(){
	      
	      return dataDeTermino;
	   }
	   
	   public String getHorario(){
	   
	      return horario;
	   }
	   
	   public int getNumeroDeVagas(){
	   
	      return numeroDeVagas;
	   }
	   
	   public double getValor(){
	   
	      return valor;
	   }
	 
	   public String getTipoLab(){
	   
	      return tipoLab;
	   }
	   
	   public String getSoftwares(){
	   
	      return softwares;
	   }
	   
	   public String getLivros(){
	   
	      return livros;
	   }
	   
	   public String getDescricao(){
	   
	      return descricaoMaterial;
	   }
	   
	   public void setNome(String nome){
	   
	      this.nome = nome;
	   }
	   
	   public void setTipo(String tipo){
	   
	      this.tipo = tipo;
	   }
	   
	   public void setDataDeInicio(String dataDeInicio){
	   
		   this.dataDeInicio = dataDeInicio;
	   }
	   
	   public void setDataDeTermino(String dataDeTermino){
	   
		   this.dataDeTermino = dataDeTermino;
	   }
	   
	   public void setHorario(String horario){
	   
		   this.horario = horario;
	   }
	   
	   public void setNumeroDeVagas(int numeroDeVagas){
	   
		   this.numeroDeVagas = numeroDeVagas;
	   }  
	   
	   public void setValor(double valor){
	   
		   this.valor = valor;
	   }
	   
	   public void setTipoLab(String tipoLab){
	   
		   this.tipoLab = tipoLab;
	   }
	   
	   public void setSoftwares(String softwares){
	   
		   this.softwares = softwares;
	   }
	   
	   public void setLivros(String livros){
	   
		   this.livros = livros;
	   }
	   
	   public void setDescricao(String descricaoMaterial){
	   
		   this.descricaoMaterial = descricaoMaterial;
	   }

	   public void incluir() {
			CursoDAO dao = new CursoDAO();
			CursoTO to = new CursoTO();
			to.setCodigo(codigo);
			to.setNome(nome);
	        to.setTipo(tipo);
	        to.setDataDeInicio(dataDeInicio);
	        to.setDataDeTermino(dataDeTermino);
	        to.setHorario(horario);
	        to.setValor(valor);
	        to.setNumeroDeVagas(numeroDeVagas);
	        to.setTipoLab(tipoLab);
	        to.setSoftwares(softwares);
	        to.setLivros(livros);
	        to.setDescricaoMaterial(descricaoMaterial);
			dao.incluir(to);
		}

		public void alterar() {
			CursoDAO dao = new CursoDAO();
			CursoTO to = new CursoTO();
			to.setCodigo(codigo);
			to.setNome(nome);
	        to.setTipo(tipo);
	        to.setDataDeInicio(dataDeInicio);
	        to.setDataDeTermino(dataDeTermino);
	        to.setHorario(horario);
	        to.setValor(valor);
	        to.setNumeroDeVagas(numeroDeVagas);
	        to.setTipoLab(tipoLab);
	        to.setSoftwares(softwares);
	        to.setLivros(livros);
	        to.setDescricaoMaterial(descricaoMaterial);
			dao.alterar(to);
		}

		public void deletar() {
			CursoDAO dao = new CursoDAO();
			CursoTO to = new CursoTO();
			to.setCodigo(codigo);
			dao.deletar(to);
		}

		public void consultar() {
			CursoDAO dao = new CursoDAO();
			CursoTO to = dao.consultar(codigo);
			to.getNome(nome);
	        to.getTipo(tipo);
	        to.getDataDeInicio(dataDeInicio);
	        to.getDataDeTermino(dataDeTermino);
	        to.getHorario(horario);
	        to.getValor(valor);
	        to.getNumeroDeVagas(numeroDeVagas);
	        to.getTipoLab(tipoLab);
	        to.getSoftwares(softwares);
	        to.getLivros(livros);
	        to.getDescricaoMaterial(descricaoMaterial);
		}

		@Override
		public String toString() {
			return "Curso [Codigo=" + codigo + ", nome=" + nome +", tipo="+tipo+ ", Data de Inicio="+ dataDeInicio+", Data de Termino="+dataDeTermino+
         ", horario="+ horario+", valor="+ valor+"' Numero de Vagas"+numeroDeVagas +", Tipo de Lab"+ tipoLab+", Softwares"+softwares+", Livros"+
         livros+", Descricao Material"+descricaoMaterial+", fone=" + fone + "]";
		}
	
}

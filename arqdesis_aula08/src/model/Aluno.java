package model;

import to.AlunoTO;
import dao.AlunoDAO;

public class Aluno{
   
   private String nome, dataNascimento, sexo, endereco, complemento, rg, cpf, email, telefone;
   private int codigo, numero;
   
   
   public Aluno(int codigo, String nome, String sexo, String dataNascimento, String endereco, int numero, String complemento,
                   String rg, String cpf, String telefone, String email)
   {   
      this.codigo = codigo;
      this.nome = nome;
      this.sexo = sexo;
      this.dataNascimento = dataNascimento;
      this.endereco = endereco;
      this.numero = numero;
      this.complemento = complemento;
      this.telefone = telefone;
      this.rg = rg;
      this.cpf = cpf;
      this.email = email;
   }
   
   //M�todos de acesso
   public int getCodigo(){
   
      return codigo;   
   }
   
   public String getNome(){
      
      return nome;    
   }
   
   public String getSexo(){
   
      return sexo;
   }
   
   public String getDataNascimento(){
   
      return dataNascimento;
   }
   
   public String getEndereco(){
   
      return endereco;
   }
   
   public int getNumero(){
      
      return numero;
   }
   
   public String getComplemento(){
   
      return complemento;
   }
   
   public String getRG(){
   
      return rg;
   }
   
   public String getCPF(){
   
      return cpf;
   }
   
   public String getEmail(){
   
      return email;
   }
   
   public String getFone(){
   
      return telefone;
   }
 
   
   //M�todos de Modifica��o
   public void setNome(String nome){
   
      this.nome = nome;
   }
   
   public void setSexo(String sexo){
   
      this.sexo = sexo;
   }
   
   public void setDataNascimento(String data){
   
      dataNascimento = data;
   }
   
   public void setCPF(String cpf){
   
      this.cpf = cpf;
   }
   
   public void setRG(String rg){
   
      this.rg = rg;
   }
   
   public void setEndereco(String endereco){
   
      this.endereco = endereco;
   }
   
   public void setNumero(int numero){
   
      this.numero = numero;
   }
   
   public void setComplemento(String complemento){
   
      this.complemento = complemento;
   }
   
   public void setEmail(String email){
   
      this.email = email;
   }  
   
   public void setFone(String telefone){
   
      this.telefone = telefone;
   }
   public void incluir() {
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = new AlunoTO();
		to.setCodigo(codigo);
		to.setNome(nome);
		to.setSexo(sexo);
		to.setDataNascimento(dataNascimento);
		to.setEndereco(endereco);
		to.setNumero(numero);
		to.setComplemento(complemento);
		to.setFone(telefone);
		to.setRG(rg);
		to.setCPF(cpf);
		to.setEmail(email);
		dao.incluir(to);
	}

	public void alterar() {
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = new AlunoTO();
		to.setCodigo(codigo);
		to.setNome(nome);
		to.setSexo(sexo);
		to.setDataNascimento(dataNascimento);
		to.setEndereco(endereco);
		to.setNumero(numero);
		to.setComplemento(complemento);
		to.setFone(telefone);
		to.setRG(rg);
		to.setCPF(cpf);
		to.setEmail(email);
		dao.alterar(to);
	}

	public void deletar() {
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = new AlunoTO();
		to.setCodigo(codigo);
		dao.deletar(to);
	}

	public void carregar() {
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = dao.carregar(codigo);
			to.getNome();
			to.getSexo();
			to.getDataNascimento();
			to.getEndereco();
			to.getNumero();
			to.getComplemento();
			to.getFone();
			to.getRG();
			to.getCPF();
			to.getEmail();
	}

	@Override
	public String toString() {
		return "Aluno [Codigo=" + codigo + ", nome=" + nome + ", sexo="+ sexo + ", Data de nascimento="
      + dataNascimento + ", Endereco="+ endereco + ", Numero="+ numero + ", Complemento="+ complemento + 
      ", fone=" + telefone +", Rg="+ rg+ ", CPF= "+cpf +", Email= "+ email+ "]";
	}
}
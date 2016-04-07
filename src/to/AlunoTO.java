package to;

public class AlunoTO{
   
   private String nome, dataNascimento, sexo, endereco, complemento, rg, cpf, email, telefone;
   private int codigo, numero;
      
   //Métodos de acesso
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
 
   
   //Métodos de Modificação
   public void setNome(String nvNome){
   
      nome = nvNome;
   }
   
   public void setSexo(String nvSexo){
   
      sexo = nvSexo;
   }
   
   public void setDataNascimento(String nvData){
   
      dataNascimento = nvData;
   }
   
   public void setCPF(String nvCPF){
   
      cpf = nvCPF;
   }
   
   public void setRG(String nvRG){
   
      rg = nvRG;
   }
   
   public void setEndereco(String nvEndereco){
   
      endereco = nvEndereco;
   }
   
   public void setNumero(int nvNumero){
   
      numero = nvNumero;
   }
   
   public void setComplemento(String nvComplemento){
   
      complemento = nvComplemento;
   }
   
   public void setEmail(String nvEmail){
   
      email = nvEmail;
   }  

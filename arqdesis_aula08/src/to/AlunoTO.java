package to;

public class AlunoTO{
   
   private String nome, dataNascimento, sexo, endereco, complemento, rg, cpf, email, fone;
   private int codigo, numero;
      
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
   
      return fone;
   }
 
   
   //M�todos de Modifica��o
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
	public void setFone(String nvFone) {
		fone = nvFone;
	}
	public void setCodigo(int nvCodigo) {
		codigo = nvCodigo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoTO other = (AlunoTO) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fone == null) {
			if (other.fone != null)
				return false;
		} else if (!fone.equals(other.fone))
			return false;
		if (codigo != other.codigo)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	



}

package to;

public class CursoTO {
	private int codigo, numeroDeVagas;
	private String nome, tipo, dataDeInicio, dataDeTermino, horario, tipoLab, softwares, livros, descricaoMaterial;
	private double valor;
   
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
	   
	   public String getDescricaoMaterial(){
	   
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
	   
	   public void setDescricaoMaterial(String descricaoMaterial){
	   
		   this.descricaoMaterial = descricaoMaterial;
	   }

	public void setCodigo(int codigo) {
		
		this.codigo = codigo;	
	}
}


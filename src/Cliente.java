import java.time.LocalDate;

public class Cliente {
	
	
	//Atributos
	private String nome;
	private String cpf;
	private LocalDate dataNas;
	private String numTel;
	private String cidade;
	private String uf;
	
	
	//Metodos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getcpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDataNasc() {
		return dataNas;
	}
	public void setDataNasc(LocalDate dataNas) {
		this.dataNas = dataNas;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	//Metodo construtor
	public Cliente(String nome, String cpf, LocalDate dataNas, String numTel, String cidade, String uf) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNas = dataNas;
		this.numTel = numTel;
		this.cidade = cidade;
		this.uf = uf;
		
	}
	
	//Metodo toString
	@Override
	public String toString(){
		return "Nome: " + nome + ", CPF: " + cpf + ", Data nascimento: " + dataNas + ", Nº: " + numTel + ", Cidade: "
				+ cidade + ", UF: " + uf + "\n";
		
	}
	
	
}

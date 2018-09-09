import java.time.LocalDateTime;

public class Ligacao {

	//Atributos
	private int codigo;
	private String numDest;
	private LocalDateTime dataIni;
	private LocalDateTime dataFim;
	private String cidadeDest;
	private String UFDest;
	private Cliente clientes;
	
	//Metodo get e set
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNumDest() {
		return numDest;
	}
	public void setNumDest(String numDest) {
		this.numDest = numDest;
	}
	public LocalDateTime getDataIni() {
		return dataIni;
	}
	public void setDataIni(LocalDateTime dataIni) {
		this.dataIni = dataIni;
	}
	public LocalDateTime getDataFim() {
		return dataFim;
	}
	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}
	public String getCidadeDest() {
		return cidadeDest;
	}
	public void setCidadeDest(String cidadeDest) {
		this.cidadeDest = cidadeDest;
	}
	public String getUFDest() {
		return UFDest;
	}
	public void setUFDest(String uFDest) {
		UFDest = uFDest;
	}
	public Cliente getClientes() {
		return clientes;
	}
	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}
	
	//Metodo construtor
	public Ligacao(int codigo, String numDest, LocalDateTime dataIni, LocalDateTime dataFim, String cidadeDest,
			String uFDest, Cliente clientes) {
		super();
		this.codigo = codigo;
		this.numDest = numDest;
		this.dataIni = dataIni;
		this.dataFim = dataFim;
		this.cidadeDest = cidadeDest;
		UFDest = uFDest;
		this.clientes = clientes;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "* Ligacao: Nº [" + codigo + "]" + "\n" + ", Nº destino: " + numDest + ", Data inicio: " + dataIni + ", Data fim: " + dataFim
				+ ", Cidade destino: " + cidadeDest + ", UF destino: " + UFDest + "\n" + "Cliente: " + clientes + "\n";
	}
	
}

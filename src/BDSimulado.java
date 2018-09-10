import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class BDSimulado {

	    //Atributos
	    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	    private ArrayList<Ligacao> ligacoes = new ArrayList<Ligacao>();
	    public BDSimulado(){
	 
	      //Criando Clientes
	      Cliente c1 = new Cliente("Evandro da Silva", "987564123-89", LocalDate.of(1940, 9, 16), "1234-56789", "Rio de Janeiro", "RJ");
	      Cliente c2 = new Cliente("João dos Montes", "457458459-45", LocalDate.of(2000, 1, 15), "1245-7896", "Brasilia", "DF");
	      Cliente c3 = new Cliente("Maria do Socorro", "235678451-56", LocalDate.of(1988, 2, 26), "4758-6958", "Brasilia", "DF");
	      Cliente c4 = new Cliente("Otaviano Neves", "895678451-91", LocalDate.of(1974, 4, 12), "2345-8945", "São Paulo", "SP");
	      Cliente c5 = new Cliente("José das Couves", "111222333-44", LocalDate.of(1991, 9, 29), "2583-6985", "Brasilia", "DF");
	      Cliente c6 = new Cliente("Regina Maria", "123456789-00", LocalDate.of(1950, 11, 6), "3265-8974", "Belo Horizonte", "MG");
	 
	      //Armazenando clientes
	      this.clientes.add(c1);
	      this.clientes.add(c2);
	      this.clientes.add(c3);
	      this.clientes.add(c4);
	      this.clientes.add(c5);
	      this.clientes.add(c6);
	 
	      //Criando Ligacoes
	      Ligacao l1 = new Ligacao(1, "(61) 1245-7896", LocalDateTime.of(2017, 9, 12, 17, 0), LocalDateTime.of(2017, 9, 12, 17, 55), "Brasilia", "DF", c1);
	      Ligacao l2 = new Ligacao(2, "(22) 3265-8974", LocalDateTime.of(2017, 9, 12, 17, 10), LocalDateTime.of(2017, 9, 12, 17, 15), "Rio de Janeiro", "RJ", c2);
	      Ligacao l3 = new Ligacao(3, "(61) 4758-6958", LocalDateTime.of(2017, 9, 12, 17, 12), LocalDateTime.of(2017, 9, 12, 18, 12), "Brasilia", "DF", c1);
	      Ligacao l4 = new Ligacao(4, "(11) 2345-8945", LocalDateTime.of(2017, 9, 12, 17, 12), LocalDateTime.of(2017, 9, 12, 17, 14), "São Paulo", "SP", c6);
	      Ligacao l5 = new Ligacao(5, "(22) 1245-7896", LocalDateTime.of(2017, 9, 12, 18, 45), LocalDateTime.of(2017, 9, 12, 19, 00), "Rio de Janeiro", "RJ", c3);
	      Ligacao l6 = new Ligacao(6, "(11) 3265-8974", LocalDateTime.of(2017, 9, 12, 19, 21), LocalDateTime.of(2017, 9, 12, 19, 30), "São Paulo", "SP", c3);
	      Ligacao l7 = new Ligacao(7, "(61) 1245-7896", LocalDateTime.of(2017, 9, 12, 19, 55), LocalDateTime.of(2017, 9, 12, 20, 30), "Brasilia", "DF", c4);
	      Ligacao l8 = new Ligacao(8, "(22) 4758-6958", LocalDateTime.of(2017, 9, 12, 20, 0), LocalDateTime.of(2017, 9, 12, 20, 22), "Rio de Janeiro", "RJ", c1);
	      Ligacao l9 = new Ligacao(9, "(22) 3265-8974", LocalDateTime.of(2017, 9, 12, 20, 13), LocalDateTime.of(2017, 9, 12, 20, 51), "Rio de Janeiro", "RJ", c6);
	      Ligacao l10 = new Ligacao(10, "(34) 1245-7896", LocalDateTime.of(2017, 9, 12, 21, 4), LocalDateTime.of(2017, 9, 12, 23, 44), "Belo Horizonte", "MG", c4);
	      Ligacao l11 = new Ligacao(11, "(22) 4758-6958", LocalDateTime.of(2017, 9, 12, 22, 13), LocalDateTime.of(2017, 9, 12, 22, 19), "Rio de Janeiro", "RJ", c3);
	      Ligacao l12 = new Ligacao(12, "(11) 2345-8945", LocalDateTime.of(2017, 9, 13, 9, 25), LocalDateTime.of(2017, 9, 13, 10, 15), "São Paulo", "SP", c1);
	      Ligacao l13 = new Ligacao(13, "(11) 1245-7896", LocalDateTime.of(2017, 9, 13, 14, 36), LocalDateTime.of(2017, 9, 13, 15, 55), "São Paulo", "SP", c6);
	      Ligacao l14 = new Ligacao(14, "(11) 3265-8974", LocalDateTime.of(2017, 9, 13, 20, 01), LocalDateTime.of(2017, 9, 13, 22, 12), "São Paulo", "SP", c2);
	      Ligacao l15 = new Ligacao(15, "(61) 1245-7896", LocalDateTime.of(2017, 9, 13, 21, 14), LocalDateTime.of(2017, 9, 13, 21, 56), "Brasilia", "DF", c1);
	      Ligacao l16 = new Ligacao(16, "(34) 4758-6958", LocalDateTime.of(2017, 9, 14, 12, 0), LocalDateTime.of(2017, 9, 14, 12, 55), "Belo Horizonte", "MG", c6);
	      Ligacao l17 = new Ligacao(17, "(22) 2345-8945", LocalDateTime.of(2017, 9, 14, 16, 32), LocalDateTime.of(2017, 9, 14, 17, 21), "Rio de Janeiro", "RJ", c4);
	      Ligacao l18 = new Ligacao(18, "(22) 1245-7896", LocalDateTime.of(2017, 9, 14, 20, 34), LocalDateTime.of(2017, 9, 14, 20, 35), "Rio de Janeiro", "RJ", c2);
	      Ligacao l19 = new Ligacao(19, "(11) 4758-6958", LocalDateTime.of(2017, 9, 15, 10, 47), LocalDateTime.of(2017, 9, 15, 11, 03), "São Paulo", "SP", c3);
	      Ligacao l20 = new Ligacao(20, "(61) 3265-8974", LocalDateTime.of(2017, 9, 15, 23, 35), LocalDateTime.of(2017, 9, 15, 23, 55), "Brasilia", "DF", c1);
	       
	      //Armazenando Ligacoes
	      this.ligacoes.add(l1);
	      this.ligacoes.add(l2);
	      this.ligacoes.add(l3);
	      this.ligacoes.add(l4);
	      this.ligacoes.add(l5);
	      this.ligacoes.add(l6);
	      this.ligacoes.add(l7);
	      this.ligacoes.add(l8);
	      this.ligacoes.add(l9);
	      this.ligacoes.add(l10);
	      this.ligacoes.add(l11);
	      this.ligacoes.add(l12);
	      this.ligacoes.add(l13);
	      this.ligacoes.add(l14);
	      this.ligacoes.add(l15);
	      this.ligacoes.add(l16);
	      this.ligacoes.add(l17);
	      this.ligacoes.add(l18);
	      this.ligacoes.add(l19);
	      this.ligacoes.add(l20);
	      
	    }
	    
		public ArrayList<Cliente> getClientes() {
			return clientes;
		}

		public ArrayList<Ligacao> getLigacoes() {
			return ligacoes;
		}
		
		
		//Questão 2a retornar informações de um cliente fornecido seu nome.
	    public String getInfoCliente(String nome) {
	    	String info = "";
	    	
	    	for (int i = 0; i < clientes.size(); i++) {
	    		if (clientes.get(i).getNome().equals(nome)) {
					info = "Nome: " + clientes.get(i).getNome() + 
							"\nData Nascimento: " + clientes.get(i).getDataNasc() +
							"\nNumero telefone: " + clientes.get(i).getNumTel() +
							"\nCidade: " + clientes.get(i).getCidade() + "-" + clientes.get(i).getUf();
				}
			}
	    	return info;
	    }
	    
	    //Questão 2b retornar ligações de um determinado cliente
	    public ArrayList<Ligacao> getLigacoes(String nome){
	    	ArrayList<Ligacao> ligacoes = new ArrayList<>();
	    	
	    	for(int i = 0; i < this.ligacoes.size(); i++) {
	    		if(this.ligacoes.get(i).getClientes().getNome().equals(nome)) {
	    			ligacoes.add(this.ligacoes.get(i));
	    		}
	    	}
	    	return ligacoes;
	    }
	    
	    //Questão 2c Numero de ligações realizadas por uma determinada UF
	    public int getLigacoesUf(String uf) {
	    	int numLig = 0;
	    	for (int i = 0; i < this.ligacoes.size(); i++) {
				if (this.ligacoes.get(i).getUFDest().equals(uf)) {
					numLig += 1;
				}
			}
	    	return numLig;
	    }
	    
	    //Questão 2d código das ligações de UF diferente
	    public ArrayList<Integer> getCodliguf(){
	    	ArrayList<Integer> cod = new ArrayList<>();
	    	
	    	for (int i = 0; i < this.ligacoes.size() ; i++) {
				if (ligacoes.get(i).getClientes().getUf() != ligacoes.get(i).getUFDest()) {
					cod.add(ligacoes.get(i).getCodigo());
				}
			}
	    	return cod;
	    }
	    
	    //Questão 3a Conta do cliente
	    public String getConta(String nome){
	    	String ligacoes = "Conta: \n" + getInfoCliente(nome);
	    	
	    	for(int i = 0; i < this.ligacoes.size(); i++) {
	    		if(this.ligacoes.get(i).getClientes().getNome().equals(nome)) {
	    			ligacoes +=  "\n\n" +
	    					"\nData e hora de inicio: " + this.ligacoes.get(i).getDataIni() +
	    					"\nNúmero de destino: " + this.ligacoes.get(i).getNumDest() +
	    					"\nCidade de destino: " + this.ligacoes.get(i).getCidadeDest() + 
	    					"-" + this.ligacoes.get(i).getUFDest();
	    		}
	    	}
	    	return ligacoes;
	    }
	    
}

	

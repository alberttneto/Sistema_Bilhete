
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		BDSimulado bd = new BDSimulado();
		String opcao = " ";
		
		do {
			
			opcao = bd.getOpcao();
			
			switch(opcao) {
		
			case "1":
				String nome1 = JOptionPane.showInputDialog("Informe o nome: ");
				JOptionPane.showMessageDialog(null, bd.getInfoCliente(nome1));
				break;
		
			case "2":
				String nome2 = JOptionPane.showInputDialog("Informe o nome: ");
				JOptionPane.showMessageDialog(null, bd.getLigacoes(nome2));
				break;
		
			case "3":
				String uf = JOptionPane.showInputDialog("Informe a UF: ");
				JOptionPane.showMessageDialog(null,"Numero de liga��es � " + bd.getLigacoesUf(uf));
				break;
		
			case "4":
				JOptionPane.showMessageDialog(null, "C�digo das liga��es: \n" + bd.getCodliguf());
				break;
		
			case "5":
				String nome3 = JOptionPane.showInputDialog("Informe o nome: ");
				JOptionPane.showMessageDialog(null, bd.getConta(nome3));
				break;
		
			case "6":
				JOptionPane.showMessageDialog(null, "Saindo...");
				System.exit(0);
				break;
		
			default:
				JOptionPane.showMessageDialog(null, "Op��o incorreta!");
				break;
			}
		
		}while(opcao != "6");
	}

}

import java.util.ArrayList;

public class Conexao {

	private ArrayList<Opcao> opcoes;

	@Override
	public String toString() {
		return "Conexao [opcoes=" + opcoes + "]";
	}

	public Conexao(ArrayList<Opcao> opcoes) {
		super();
		this.opcoes = opcoes;
	}

	public ArrayList<Opcao> getOpcoes() {
		return opcoes;
	}

	public void setOpcoes(ArrayList<Opcao> opcoes) {
		this.opcoes = opcoes;
	}

}

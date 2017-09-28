public class Conexao {

	private Contato contato;
	private String tipo;
	private String valor;

	@Override
	public String toString() {
		return "Conexao [contato=" + contato + ", tipo=" + tipo + ", valor=" + valor + "]";
	}

	public Conexao(Contato contatoPorNome, String tipo2, String valor2) {
		// TODO Auto-generated constructor stub
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}

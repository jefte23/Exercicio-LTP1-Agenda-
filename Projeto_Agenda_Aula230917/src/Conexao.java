public class Conexao {

	private String tipo;
	private String valor;

	@Override
	public String toString() {
		return "Conexao [tipo=" + tipo + ", valor=" + valor + "]";
	}

	public Conexao(String tipo, String valor) {
		super();
		this.tipo = tipo;
		this.valor = valor;
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

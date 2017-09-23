
public class Opcao {

	private String telefoneFixo;
	private String relefoneCelular;
	private String Email;

	// Metodo ToString
	@Override
	public String toString() {
		return "Opcao [telefoneFixo=" + telefoneFixo + ", relefoneCelular=" + relefoneCelular + ", Email=" + Email
				+ "]";
	}

	// Metodo Construtor
	public Opcao(String telefoneFixo, String relefoneCelular, String email) {
		super();
		this.telefoneFixo = telefoneFixo;
		this.relefoneCelular = relefoneCelular;
		Email = email;
	}

	// Metodos Get's e Set's
	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getRelefoneCelular() {
		return relefoneCelular;
	}

	public void setRelefoneCelular(String relefoneCelular) {
		this.relefoneCelular = relefoneCelular;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}

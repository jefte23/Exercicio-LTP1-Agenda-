import java.util.ArrayList;

public class Contato {

	private String nome;
	private String dataNascimento;
	private String sexo;
	private String cidade;
	private String UF;
	private Empresa empresa;
	private ArrayList<Conexao> acessos;

	// Metodo ToString
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", cidade=" + cidade
				+ ", UF=" + UF + ", empresa=" + empresa + ", acessos=" + acessos + "]";
	}

	// Metodo Construtor
	public Contato(String nome, String dataNascimento, String sexo, String cidade, String UF, Empresa empresa,
			ArrayList<Conexao> acessos) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cidade = cidade;
		this.UF = UF;
		this.empresa = empresa;
		this.acessos = acessos;
	}

	// Metodos Set's e Get's
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String UF) {
		this.UF = UF;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public ArrayList<Conexao> getAcessos() {
		return acessos;
	}

	public void setAcessos(ArrayList<Conexao> acessos) {
		this.acessos = acessos;
	}

}

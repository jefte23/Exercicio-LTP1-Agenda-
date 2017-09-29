import java.util.ArrayList;

public class Contato {

	private String nome;
	private String dataNascimento;
	private String sexo;
	private String cidade;
	private String UF;
	private Empresa empresa;
	private ArrayList<Conexao> conexoes = new ArrayList<Conexao>();

	// Metodo ToString
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", cidade=" + cidade
				+ ", UF=" + UF + ", empresa=" + empresa + ", conexoes=" + conexoes + "]";
	}

	// Metodo Construtor
	public Contato(String nome, String dataNascimento, String sexo, String cidade, String UF, Empresa empresa) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cidade = cidade;
		this.UF = UF;
		this.empresa = empresa;
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

	public ArrayList<Conexao> getAConexoes() {
		return conexoes;
	}

	public void setConexoes(ArrayList<Conexao> conexoes) {
		this.conexoes = conexoes;
	}

}

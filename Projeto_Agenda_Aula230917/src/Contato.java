import java.time.LocalDate;
import java.util.ArrayList;

public class Contato implements Comparable<Contato> {

	private String nome;
	private LocalDate dataNascimento;
	private String sexo;
	private String cidade;
	private String UF;
	private Empresa empresa;
	private ArrayList<Conexao> conexoes = new ArrayList<Conexao>();

	// Metodo ToString
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", dataNascimento=" + getDataComoString() + ", sexo=" + sexo + ", cidade="
				+ cidade + ", UF=" + UF + ", empresa=" + empresa + ", conexoes=" + conexoes + "]";
	}

	// Metodo Construtor
	public Contato(String nome, LocalDate dataNascimento, String sexo, String cidade, String UF, Empresa empresa,
			ArrayList<Conexao> conexoes) {
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
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

	public String getDataComoString() {
		return dataNascimento.getDayOfMonth() + "/" + dataNascimento.getMonthValue() + "/" + dataNascimento.getYear();
	}

	// http://blog.alura.com.br/ordenando-uma-lista-de-objetos-em-java/
	// https://www.tutorialspoint.com/java/java_using_comparator.htm

	public int compareTo(Contato contato) {
		return this.nome.compareTo(contato.getNome());
	}

}

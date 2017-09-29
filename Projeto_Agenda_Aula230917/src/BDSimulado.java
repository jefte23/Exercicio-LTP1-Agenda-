import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class BDSimulado {
	// Atributos
	ArrayList<Contato> contato;
	ArrayList<Empresa> empresas;

	public BDSimulado() {
		// Instanciar Objetos da CLasse Empresa
		this.empresas = new ArrayList<Empresa>();
		Empresa e1 = new Empresa("Capgemini", "1154454145", "Curitiba", "PR");
		Empresa e2 = new Empresa("Banco do Brasil", "0024154110", "Brasilia", "DF");
		Empresa e3 = new Empresa("CAST", "1542898756", "Rio de Janeiro", "DF");
		// Adicionando Empresas a Array
		this.empresas.add(e1);
		this.empresas.add(e2);
		this.empresas.add(e3);

		// Instanciar Objetos da Classe Contato;
		this.contato = new ArrayList<Contato>();
		Contato c1 = new Contato("João", LocalDate.of(1990, 10, 15), "Masculino", "São Paulo", "SP", e1, null);
		Contato c2 = new Contato("Mario", LocalDate.of(1999, 9, 01), "Masculino", "Brasilia", "DF", e3, null);
		Contato c3 = new Contato("Erivelton", LocalDate.of(1980, 05, 03), "Masculino", "Belem", "PA", e2, null);
		Contato c4 = new Contato("Larine", LocalDate.of(1990, 2, 03), "Feminino", "Brasilia", "DF", e1, null);
		Contato c5 = new Contato("Raquel", LocalDate.of(1992, 11, 26), "Feminino", "Salvador", "BA", e1, null);
		Contato c6 = new Contato("Eron", LocalDate.of(1986, 9, 30), "Masculino", "Salvador", "BA", e2, null);
		Contato c7 = new Contato("Pedro", LocalDate.of(1983, 3, 12), "Masculino", "Patos", "MG", e3, null);
		Contato c8 = new Contato("Jefté", LocalDate.of(1988, 9, 17), "Masculino", "Pernambuco", "PE", e1, null);
		Contato c9 = new Contato("Laresa", LocalDate.of(1993, 2, 02), "Feminino", "Brasilia", "DF", e2, null);
		Contato c10 = new Contato("Vinicius", LocalDate.of(1989, 12, 22), "Masculino", "Rio de Janeiro", "RJ", e3,
				null);

		// Adicionando Contato a Array
		this.contato.add(c1);
		this.contato.add(c2);
		this.contato.add(c3);
		this.contato.add(c4);
		this.contato.add(c5);
		this.contato.add(c6);
		this.contato.add(c7);
		this.contato.add(c8);
		this.contato.add(c9);
		this.contato.add(c10);
	}

	public ArrayList<Contato> getContatos() {
		return contato;
	}

	public ArrayList<Empresa> getEmpresas() {
		return empresas;
	}

	// Classe para buscar usuário pelo nome
	public Contato getContatoPorNome(String nome) {

		Contato resultado = null;
		for (int i = 0; i < this.contato.size(); i++) {
			if (this.contato.get(i).getNome().equals(nome)) {
				resultado = this.contato.get(i);
			}
		}
		return resultado;
	}

	// Questão 2: Adicionar valorers de conexao aos contatos aos contatos
	public void addConexaoContato(String nomeContato, String tipo, String valor) {

		// Declarar um objeto de contato
		Conexao conexoes = new Conexao(tipo, valor);
		// Percorrer a lista de filmes
		for (int i = 0; i < this.contato.size(); i++) {
			if (this.contato.get(i).getNome().equals(nomeContato)) {
				this.contato.get(i).getAConexoes().add(conexoes);
			}
		}
	}
	// ----------------------------------------------------------------

	// Questão 3: Classe que recupera dados de todos os contatos/empresas e
	// aonde eles trabalham
	public ArrayList<Contato> getDadosContatos() {

		ArrayList<Contato> resultado = new ArrayList<Contato>();
		for (int i = 0; i < this.contato.size(); i++) {
			resultado.add(this.contato.get(i));
		}
		return resultado;
	}
	// ----------------------------------------------------------------

	// Questão 4: Retorne todos os contatos de uma determinada UF.
	public ArrayList<Contato> getContatosUF(String BuscaUF) {

		ArrayList<Contato> resultado = new ArrayList<Contato>();
		for (int i = 0; i < this.contato.size(); i++) {
			if (this.contato.get(i).getUF().equals(BuscaUF)) {
				resultado.add(this.contato.get(i));
			}
		}
		return resultado;
	}
	// ----------------------------------------------------------------

	// Questão 5: todos os contatos cujo nome comece com “A”.
	public ArrayList<Contato> getContatoLetra(String buscaLetra) {

		ArrayList<Contato> resultado = new ArrayList<Contato>();
		for (int i = 0; i < this.contato.size(); i++) {
			if (this.contato.get(i).getNome().substring(0, 1).equals(buscaLetra)) {
				resultado.add(this.contato.get(i));
			}
		}

		return resultado;
	}
	// ----------------------------------------------------------------

	// Questão 6 : recupere apenas os contatos de uma determinada empresa e que
	// sejam do sexo feminino.
	public ArrayList<Contato> getMulherPorEmpresa(String empresa) {

		String Sexo = "Feminino";
		ArrayList<Contato> resultado = new ArrayList<Contato>();
		for (int i = 0; i < this.contato.size(); i++) {
			if ((this.contato.get(i).getSexo().equals(Sexo))
					&& (this.contato.get(i).getEmpresa().getNome().equals(empresa))) {
				resultado.add(this.contato.get(i));
			}
		}
		return resultado;
	}
	// ----------------------------------------------------------------

	// Questão 7: retorne uma <lista> com o número de contatos que estão
	// cadastrados para cada empresa, mostrando também o nome de cada empresa.
	public ArrayList<Empresa> getQtdFuncEmpresa() {

		ArrayList<Empresa> resultado = new ArrayList<Empresa>();
		for (int i = 0; i < this.empresas.size(); i++) {
			resultado.add(this.empresas.get(i));
		}
		return resultado;
	}

	public int contContatosEmpresa(String nomeEmpresa) {

		int resultado = 0;
		for (int i = 0; i < this.contato.size(); i++) {
			if (this.contato.get(i).getEmpresa().getNome().equals(nomeEmpresa)) {
				resultado++;
			}
		}
		return resultado;
	}

	// Questão Bonus: Ordenar a lista em ordem alfabetica por contato
	public ArrayList<Contato> ordenandoComparable() {
		Collections.sort(contato);
		ArrayList<Contato> resultado = new ArrayList<Contato>();
		for (int i = 0; i < this.contato.size(); i++) {
			resultado.add(this.contato.get(i));
		}
		return resultado;
	}
}

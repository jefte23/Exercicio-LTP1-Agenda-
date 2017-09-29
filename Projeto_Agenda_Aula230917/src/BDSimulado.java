import java.util.ArrayList;

public class BDSimulado {
	// Atributos
	ArrayList<Contato> contato;
	ArrayList<Empresa> empresas;
	ArrayList<Conexao> conexoes;

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
		Contato c1 = new Contato("João", "01/09/2000", "Masculino", "São Paulo", "SP", e1);
		Contato c2 = new Contato("Mario", "01/09/1999", "Masculino", "Brasilia", "DF", e3);
		Contato c3 = new Contato("Erivelton", "01/09/1980", "Masculino", "Belem", "PA", e2);
		Contato c4 = new Contato("Larine", "01/09/1990", "Feminino", "Brasilia", "DF", e1);
		Contato c5 = new Contato("Raquel", "01/09/1994", "Feminino", "Salvador", "BA", e1);
		Contato c6 = new Contato("Eron", "01/09/1986", "Masculino", "Salvador", "BA", e2);
		Contato c7 = new Contato("Pedro", "01/09/1983", "Masculino", "Patos", "MG", e3);
		Contato c8 = new Contato("Jefté", "01/05/1988", "Masculino", "Pernambuco", "PE", e1);
		Contato c9 = new Contato("Laresa", "01/09/1993", "Feminino", "Brasilia", "DF", e2);
		Contato c10 = new Contato("Vinicius", "01/09/1989", "Masculino", "Rio de Janeiro", "RJ", e3);

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

}

import java.util.ArrayList;

public class BDSimulado {
	// Atributos
	ArrayList<Contato> contatos;
	ArrayList<Empresa> empresas;
	ArrayList<Conexao> conexao;
	ArrayList<Opcao> opcoes;

	public BDSimulado() {
		// Instanciar Objetos da Classe opção
		this.opcoes = new ArrayList<Opcao>();
		Opcao o1 = new Opcao("34914049", "82395757", null);
		Opcao o2 = new Opcao(null, "89578457", null);
		Opcao o3 = new Opcao(null, "98658547", null);
		Opcao o4 = new Opcao("33358455", null, null);
		Opcao o5 = new Opcao(null, null, "atendimento@Capgemini.com");
		Opcao o6 = new Opcao("35848757", null, "atencimento@bb.com.br");
		Opcao o7 = new Opcao("35848757", "89578457", null);
		Opcao o8 = new Opcao(null, "99996655", "Raquel@gmail.com");
		Opcao o9 = new Opcao("33545845", "5558875", null);
		Opcao o10 = new Opcao("35848757", "89578457", null);
		// Adiciona objetos
		this.opcoes.add(o1);
		this.opcoes.add(o2);
		this.opcoes.add(o3);
		this.opcoes.add(o4);
		this.opcoes.add(o5);
		this.opcoes.add(o6);
		this.opcoes.add(o7);
		this.opcoes.add(o8);
		this.opcoes.add(o9);
		this.opcoes.add(o10);

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
		this.contatos = new ArrayList<Contato>();
		Contato c1 = new Contato("João", "01/09/2000", "Masculino", "São Paulo", "SP", null, conexao);
		Contato c2 = new Contato("Mario", "01/09/1999", "Masculino", "Brasilia", "DF", null, conexao);
		Contato c3 = new Contato("Erivelton", "01/09/1980", "Masculino", "Belem", "PA", null, conexao);
		Contato c4 = new Contato("Larine", "01/09/1990", "Feminino", "Brasilia", "DF", null, conexao);
		Contato c5 = new Contato("Raquel", "01/09/1994", "Feminino", "Salvador", "BA", null, conexao);
		Contato c6 = new Contato("Eron", "01/09/1986", "Masculino", "Salvador", "BA", null, conexao);
		Contato c7 = new Contato("Pedro", "01/09/1983", "Masculino", "Patos", "MG", null, conexao);
		Contato c8 = new Contato("Capgemini", "01/05/1998", "Empresa", "Curitiba", "PR", e1, conexao);
		Contato c9 = new Contato("Banco do Brasil", "01/09/1700", "Empresa", "Brasilia", "DF", e2, conexao);
		Contato c10 = new Contato("CAST", "01/09/1995", "Empresa", "Rio de Janeiro", "RJ", e3, conexao);
		// Adicionando Contato a Array
		this.contatos.add(c1);
		this.contatos.add(c2);
		this.contatos.add(c3);
		this.contatos.add(c4);
		this.contatos.add(c5);
		this.contatos.add(c6);
		this.contatos.add(c7);
		this.contatos.add(c8);
		this.contatos.add(c9);
		this.contatos.add(c10);
	}

	public ArrayList<Contato> getContatos() {
		return contatos;
	}

	public ArrayList<Empresa> getEmpresas() {
		return empresas;
	}

	public ArrayList<Conexao> getConexao() {
		return conexao;
	}

}

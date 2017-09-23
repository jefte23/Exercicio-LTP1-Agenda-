import java.util.ArrayList;

public class BDSimulado {
	// Atributos
	ArrayList<Contato> contatos;
	ArrayList<Empresa> empresas;
	ArrayList<Conexao> conexoes;

	public BDSimulado() {
		// Instanciar Objetos da Classe opção
		this.conexoes = new ArrayList<Conexao>();
		Conexao co1 = new Conexao("Celular", "89578457");
		Conexao co2 = new Conexao("Residencial", "33358455");
		Conexao co3 = new Conexao("Email", "atendimento@Capgemini.com");
		Conexao co4 = new Conexao("Residencial", "35848757");
		Conexao co5 = new Conexao("Email", "atencimento@bb.com.br");
		Conexao co6 = new Conexao("Email", "Raquel@gmail.com");
		Conexao co7 = new Conexao("Residencial", "35848757");
		Conexao co8 = new Conexao("Celular", "99669987");
		Conexao co9 = new Conexao("Residencial", "35848757");
		Conexao co10 = new Conexao("Residencial", "33545845");
		Conexao co11 = new Conexao("Residdencial", "35848757");
		Conexao co12 = new Conexao("Celular", "89578457");
		Conexao co13 = new Conexao("Celular", "99857585");
		Conexao co14 = new Conexao("Email", "junior@Capgemni.com");
		Conexao co15 = new Conexao("Email", "Pedro@uol.com.br");
		// Adiciona objetos
		this.conexoes.add(co1);
		this.conexoes.add(co2);
		this.conexoes.add(co3);
		this.conexoes.add(co4);
		this.conexoes.add(co5);
		this.conexoes.add(co6);
		this.conexoes.add(co7);
		this.conexoes.add(co8);
		this.conexoes.add(co9);
		this.conexoes.add(co10);
		this.conexoes.add(co11);
		this.conexoes.add(co12);
		this.conexoes.add(co13);
		this.conexoes.add(co14);
		this.conexoes.add(co15);

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
		Contato c1 = new Contato("João", "01/09/2000", "Masculino", "São Paulo", "SP", null);
		Contato c2 = new Contato("Mario", "01/09/1999", "Masculino", "Brasilia", "DF", null);
		Contato c3 = new Contato("Erivelton", "01/09/1980", "Masculino", "Belem", "PA", null);
		Contato c4 = new Contato("Larine", "01/09/1990", "Feminino", "Brasilia", "DF", null);
		Contato c5 = new Contato("Raquel", "01/09/1994", "Feminino", "Salvador", "BA", null);
		Contato c6 = new Contato("Eron", "01/09/1986", "Masculino", "Salvador", "BA", null);
		Contato c7 = new Contato("Pedro", "01/09/1983", "Masculino", "Patos", "MG", null);
		Contato c8 = new Contato("Capgemini", "01/05/1998", "Empresa", "Curitiba", "PR", e1);
		Contato c9 = new Contato("Banco do Brasil", "01/09/1700", "Empresa", "Brasilia", "DF", e2);
		Contato c10 = new Contato("CAST", "01/09/1995", "Empresa", "Rio de Janeiro", "RJ", e3);
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
		return conexoes;
	}

}
